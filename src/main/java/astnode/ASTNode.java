package astnode;

import semantics.exceptions.NamingConflictException;
import semantics.exceptions.VariableTypeConflictException;
import semantics.util.OperatorSet;
import semantics.util.SymbolMap;
import semantics.util.TypeSet;

import java.util.ArrayList;

/**
 * 自定义的树形节点类
 */
public class ASTNode {

    /**
     * 节点存储的字符串。<br>
     * 生成的 AST 中的所有无效节点的 type 属性为 null，其余为对应的终结符。
     */
    private String treeInfo;

    private String type;
    /**
     * 节点的所有子节点。
     * 叶子节点的 children 属性为 empty
     */
    ArrayList<ASTNode> children = new ArrayList<>();

    /**
     * 无效辅助节点的无参构造。{@link #treeInfo}属性不初始化，始终为null。
     */

    public ASTNode() {
    }

    /**
     * 存储终结符信息的有参构造。<br>
     * 将 type 赋值给{@link #treeInfo}.
     *
     * @param treeInfo 构造传入的终结符
     */
    public ASTNode(String treeInfo) {
        this.treeInfo = treeInfo;
    }

    public ASTNode(String treeInfo, String type) {
        this.treeInfo = treeInfo;
        this.type = type;
    }

    public void addChild(ASTNode child) {
        if (child.children != null) {
            children.add(child);
        }
    }

    /**
     * 遍历{@link ASTNode}下的所有子节点。
     *
     * @param root  当前遍历的根节点。
     * @param depth 当前根节点的深度。<br>
     *              如果节点的{@link ASTNode#treeInfo} 属性为{@code null}，则深度于其父节点相同。
     * @return 遍历最终得到的用于展示当前根节点下子节点的字符串
     */
    public String traverse(ASTNode root, int depth) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            if (root.treeInfo != null && !root.treeInfo.isEmpty()) {//treeNode属性不为空
                builder.append(lineBuilder(depth)).append(root.treeInfo).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {//treeNode属性为空
                    builder.append(traverse(node, depth + 1));
                }
            }
        }
        return builder.toString();
    }

    /**
     * 语义分析
     *
     * @param root 待分析的AST的根节点
     * @throws NamingConflictException 命名冲突异常
     */
    public void semanticCheck(ASTNode root) throws NamingConflictException, VariableTypeConflictException {

        if (root.treeInfo == null || root.treeInfo.isEmpty()) {//根节点
            for (ASTNode node :
                    root.children) {
                semanticCheck(node);
            }
            return;
        }
        if (root.treeInfo.equals("module")) {
            //module节点，子节点仅有module和struct

            SymbolMap.insertName(
                    root.children.get(0).treeInfo,
                    "module");

            if (root.children.size() > 1) {
                for (ASTNode node :
                        root.children.subList(1, root.children.size())) {
                    semanticCheck(node);

                }
            }
            SymbolMap.removeName();
        } else if (root.treeInfo.equals("struct")) {
            //struct节点，子节点为struct_in，基本类型，scoped_name类型，和变量名ID

            SymbolMap.insertName(
                    root.children.get(0).treeInfo, "struct");

            String dType = "";

            if (root.children.size() > 1) {
                for (ASTNode n :
                        root.children.subList(1, root.children.size())) {
                    if (n.treeInfo.equals("struct")) {
                        dType = SymbolMap.getNamingScope() +
                                "::" +
                                n.children.get(0).treeInfo;
                        n.setTreeInfo("struct_in");
                        semanticCheck(n);
                    } else if (n.treeInfo.startsWith("[") &&
                            !n.treeInfo.startsWith("[[")) {//基本类型
                        dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                    } else if (n.treeInfo.startsWith("[[")) {//scoped_name 类型
                        dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                    } else {//变量名ID
                        SymbolMap.insertName(n.treeInfo, dType);
                        if (n.children.size() > 1) {
                            if (n.children.get(0).treeInfo.equals("=")) {//有赋值语句
                                n.setType(dType);
                                operatorProcess(n.children.get(1), dType);//todo 有错 debug继续运行五次到错误处
                            } else {//数组
                                if (root.children.size() !=
                                        Integer.parseInt(root.children.get(0).treeInfo)) {
                                    throw new VariableTypeConflictException();
                                }
                                for (ASTNode n1 :
                                        root.children.subList(1, root.children.size())) {
                                    operatorProcess(n1, dType);
                                }
                            }
                        }
                    }
                }
            }

            SymbolMap.removeName();
        } else if (root.treeInfo.equals("struct_in")) {

            SymbolMap.insertName(
                    root.children.get(0).treeInfo, "struct_in");

            String dType = "";

            if (root.children.size() > 1) {
                for (ASTNode n :
                        root.children.subList(1, root.children.size())) {
                    if (n.treeInfo.equals("struct")) {
                        dType = SymbolMap.getNamingScope() +
                                "::" +
                                n.children.get(0).treeInfo;
                        n.setTreeInfo("struct_in");
                        semanticCheck(n);
                    }

                    if (n.treeInfo.startsWith("[") &&
                            !n.treeInfo.startsWith("[[")) {//基本类型
                        dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                    } else if (n.treeInfo.startsWith("[[")) {//scoped_name 类型
                        dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                    } else {//变量名ID
                        SymbolMap.insertName(n.treeInfo, dType);
                        if (n.children.size() > 1) {
                            if (n.children.get(0).treeInfo.equals("=")) {//有赋值语句
                                n.setType(dType);
                                operatorProcess(n.children.get(1), dType);//todo 有错 debug继续运行五次到错误处
                            } else {//数组
                                if (root.children.size() !=
                                        Integer.parseInt(root.children.get(0).treeInfo)) {
                                    throw new VariableTypeConflictException();
                                }
                                for (ASTNode n1 :
                                        root.children.subList(1, root.children.size())) {
                                    operatorProcess(n1, dType);
                                }
                            }
                        }
                    }
                }
            }

            SymbolMap.removeName();

        } else if (TypeSet.inTypeSet(root.type)) {//变量名ID，且有赋值语句
            if (root.children.get(0).treeInfo.equals("=")) {//非数组的赋值语句
                operatorProcess(root.children.get(1), root.type);
            } else if (
                    TypeSet.findType(root.children.get(0).treeInfo)
                            .equals("int")) {//数组声明
                if (root.children.size() > 1) {

                    if (
                            !(root.children.size() ==
                                    Integer.parseInt(root.children.get(0).treeInfo))
                    ) {//数组与初始化元素个数不一致
                        throw new VariableTypeConflictException();
                    }
                    for (ASTNode n :
                            root.children.subList(1, root.children.size())) {
                        operatorProcess(n, root.type);
                    }
                }
            }
        }
    }

    private void operatorProcess(ASTNode root, String dType) throws VariableTypeConflictException {
        String temp = dType;
        if (dType.startsWith("uint")) {
            dType = dType.substring(1);
        }
        switch (root.children.size()) {
            case 0://字面量
                if (!dType.startsWith(TypeSet.findType(root.treeInfo))) {//类型不匹配
                    throw new VariableTypeConflictException();
                }
            case 1://单目运算符
                if (!OperatorSet.inOpSet(root.treeInfo + "1", dType) ||
                        temp.startsWith("uint") && root.treeInfo.equals("-")
                ) {
                    throw new VariableTypeConflictException();
                }

            case 2://双目运算符
            default:
                if (!OperatorSet.inOpSet(root.treeInfo, dType)) {
                    throw new VariableTypeConflictException();
                }
                operatorProcess(root.children.get(0), dType);
                operatorProcess(root.children.get(1), dType);

        }
    }

    private void structTypeProcess(ASTNode root) throws NamingConflictException, VariableTypeConflictException {
        String dType = "";

        if (root.children.size() > 1) {
            for (ASTNode n :
                    root.children.subList(1, root.children.size())) {
                if (n.treeInfo.equals("struct")) {
                    dType = SymbolMap.getNamingScope() +
                            "::" +
                            n.children.get(0).treeInfo;
                    n.setTreeInfo("struct_in");
                    semanticCheck(n);
                }

                if (n.treeInfo.startsWith("[") &&
                        !n.treeInfo.startsWith("[[")) {//基本类型
                    dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                } else if (n.treeInfo.startsWith("[[")) {//scoped_name 类型
                    dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                } else {//变量名ID
                    SymbolMap.insertName(n.treeInfo, dType);
                    if (!n.children.isEmpty()) {//有赋值语句
                        n.setType(dType);
                        semanticCheck(n.children.get(1));//todo 有错 debug继续运行五次到错误处
                    }
                }
            }
        }

        SymbolMap.removeName();
    }

    public void setTreeInfo(String treeInfo) {
        this.treeInfo = treeInfo;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 生成一个由数量为 {length} * 2 个空格组成的字符串
     *
     * @param length 字符串长度
     * @return 生成的字符串
     */
    private String lineBuilder(int length) {

        return "  ".repeat(Math.max(0, length));
    }


}
