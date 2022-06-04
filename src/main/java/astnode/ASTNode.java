package astnode;

import semantics.exceptions.VariableNamingConflictException;
import semantics.symblemap.SymbolTable;

import java.util.*;

/**
 * 自定义的树形节点类
 */
public class ASTNode {

    /**
     * 节点存储的字符串。<br>
     * 生成的 AST 中的所有无效节点的 treeInfo 属性为 null，其余为对应的终结符。
     */
    String treeInfo;

    String name;
    String type;

    HashMap<String, String> symbolTable;

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
     * 将 value 赋值给{@link #treeInfo}.
     *
     * @param treeInfo 构造传入的终结符
     */
    public ASTNode(String treeInfo) {
        this.treeInfo = treeInfo;
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

            if (root.treeInfo != null &&
                    !root.treeInfo.equals("SPEC")
//                    && !root.value.equals("expList")
            ) {
                builder.append(lineBuilder(depth)).append(root.treeInfo).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {//value属性为空
                    builder.append(traverse(node, depth + 1));
                }
            }
        }
        return builder.toString();
    }

    public ASTNode reformat(ASTNode root, String parentType) {
        ASTNode out;
        out = new ASTNode(root.treeInfo);
        if (!root.children.isEmpty()) {//非叶子节点

            if (root.treeInfo.equals("module") || root.treeInfo.equals("struct")) {
                out.type = root.getTreeInfo();
            }
        } else {//叶子节点
            if (root.treeInfo.startsWith("[") && root.treeInfo.endsWith("]")) {
                out.type = root.getTreeInfo();
            } else if (!root.treeInfo.equals("{") && !root.treeInfo.equals("}")) {
                if (parentType.equals("module") || parentType.equals("struct")) {
                    out.type = parentType;
                }
            }

        }
        return null;

    }

    public void traverse(ASTNode astNode) {

        if (astNode == null) {
            return;
        }

        SymbolTable symbolTable = new SymbolTable();

        StringBuilder namePath = new StringBuilder();
        String type = "";

        Queue<ASTNode> traverseQueue = new LinkedList<>();//遍历用的队列
        Queue<ASTNode> scopeMatchQueue = new LinkedList<>();//存放未匹配变量名的module和struct队列
        traverseQueue.offer(astNode);
        while (!traverseQueue.isEmpty()) {
            ASTNode node = traverseQueue.poll();
            if (!node.children.isEmpty()) {
                for (ASTNode child :
                        node.children) {
                    traverseQueue.offer(child);
                }
            }
            if (node.treeInfo.equals("SPEC")|| node.treeInfo.equals("expList")) {

                continue;

            } else if (node.treeInfo.equals("module") || node.treeInfo.equals("struct")) {
                scopeMatchQueue.offer(node);
            } else if (node.treeInfo.startsWith("[")
                    && !node.treeInfo.startsWith("[[")
                    && node.treeInfo.endsWith("]")) {
                type = node.treeInfo;
            } else if (node.treeInfo.equals("{")) {//当前module或struct作用域开始

            } else if (node.treeInfo.equals("}")) {//当前module或struct作用域结束

            } else if (node.treeInfo.equals("[")) {

            } else if (node.treeInfo.equals("]")) {

            } else {
                if (!scopeMatchQueue.isEmpty()) {//module或struct的ID
                    ASTNode node1 = scopeMatchQueue.poll();
                    namePath.append(".").append(node.treeInfo);
                    try {
                        symbolTable.insert(namePath.toString(), node1.treeInfo);
                    } catch (VariableNamingConflictException e) {
                        String out = namePath.toString() + " " + node1.treeInfo
                                + " " + "在当前作用域下重复命名";
                        System.err.println();
                        return;
                    }
                } else if (!type.equals("")) {//基本类型的ID

                    namePath.append(node.treeInfo);
                    try {
                        symbolTable.insert(namePath.toString(), type);
                    } catch (VariableNamingConflictException e) {
                        String out = namePath.toString() + " " + type
                                + " " + "在当前作用域下重复命名";
                        System.err.println();
                        return;
                    }

                    type = "";
                }
            }


        }
    }

    public String getTreeInfo() {
        return treeInfo;
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
