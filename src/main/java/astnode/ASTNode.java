package astnode;

import semantics.exceptions.NamingConflictException;
import semantics.exceptions.VariableTypeConflictException;
import semantics.util.OperatorSet;
import semantics.util.SymbolMap;
import semantics.util.TypeSet;

import java.util.ArrayList;

/**
 * �Զ�������νڵ���
 */
public class ASTNode {

    /**
     * �ڵ�洢���ַ�����<br>
     * ���ɵ� AST �е�������Ч�ڵ�� type ����Ϊ null������Ϊ��Ӧ���ս����
     */
    private String treeInfo;

    private String type;
    /**
     * �ڵ�������ӽڵ㡣
     * Ҷ�ӽڵ�� children ����Ϊ empty
     */
    ArrayList<ASTNode> children = new ArrayList<>();

    /**
     * ��Ч�����ڵ���޲ι��졣{@link #treeInfo}���Բ���ʼ����ʼ��Ϊnull��
     */

    public ASTNode() {
    }

    /**
     * �洢�ս����Ϣ���вι��졣<br>
     * �� type ��ֵ��{@link #treeInfo}.
     *
     * @param treeInfo ���촫����ս��
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
     * ����{@link ASTNode}�µ������ӽڵ㡣
     *
     * @param root  ��ǰ�����ĸ��ڵ㡣
     * @param depth ��ǰ���ڵ����ȡ�<br>
     *              ����ڵ��{@link ASTNode#treeInfo} ����Ϊ{@code null}����������丸�ڵ���ͬ��
     * @return �������յõ�������չʾ��ǰ���ڵ����ӽڵ���ַ���
     */
    public String traverse(ASTNode root, int depth) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            if (root.treeInfo != null && !root.treeInfo.isEmpty()) {//treeNode���Բ�Ϊ��
                builder.append(lineBuilder(depth)).append(root.treeInfo).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {//treeNode����Ϊ��
                    builder.append(traverse(node, depth + 1));
                }
            }
        }
        return builder.toString();
    }

    /**
     * �������
     *
     * @param root ��������AST�ĸ��ڵ�
     * @throws NamingConflictException ������ͻ�쳣
     */
    public void semanticCheck(ASTNode root) throws NamingConflictException, VariableTypeConflictException {

        if (root.treeInfo == null || root.treeInfo.isEmpty()) {//���ڵ�
            for (ASTNode node :
                    root.children) {
                semanticCheck(node);
            }
            return;
        }
        if (root.treeInfo.equals("module")) {
            //module�ڵ㣬�ӽڵ����module��struct

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
            //struct�ڵ㣬�ӽڵ�Ϊstruct_in���������ͣ�scoped_name���ͣ��ͱ�����ID

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
                            !n.treeInfo.startsWith("[[")) {//��������
                        dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                    } else if (n.treeInfo.startsWith("[[")) {//scoped_name ����
                        dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                    } else {//������ID
                        SymbolMap.insertName(n.treeInfo, dType);
                        if (n.children.size() > 1) {
                            if (n.children.get(0).treeInfo.equals("=")) {//�и�ֵ���
                                n.setType(dType);
                                operatorProcess(n.children.get(1), dType);//todo �д� debug����������ε�����
                            } else {//����
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
                            !n.treeInfo.startsWith("[[")) {//��������
                        dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                    } else if (n.treeInfo.startsWith("[[")) {//scoped_name ����
                        dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                    } else {//������ID
                        SymbolMap.insertName(n.treeInfo, dType);
                        if (n.children.size() > 1) {
                            if (n.children.get(0).treeInfo.equals("=")) {//�и�ֵ���
                                n.setType(dType);
                                operatorProcess(n.children.get(1), dType);//todo �д� debug����������ε�����
                            } else {//����
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

        } else if (TypeSet.inTypeSet(root.type)) {//������ID�����и�ֵ���
            if (root.children.get(0).treeInfo.equals("=")) {//������ĸ�ֵ���
                operatorProcess(root.children.get(1), root.type);
            } else if (
                    TypeSet.findType(root.children.get(0).treeInfo)
                            .equals("int")) {//��������
                if (root.children.size() > 1) {

                    if (
                            !(root.children.size() ==
                                    Integer.parseInt(root.children.get(0).treeInfo))
                    ) {//�������ʼ��Ԫ�ظ�����һ��
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
            case 0://������
                if (!dType.startsWith(TypeSet.findType(root.treeInfo))) {//���Ͳ�ƥ��
                    throw new VariableTypeConflictException();
                }
            case 1://��Ŀ�����
                if (!OperatorSet.inOpSet(root.treeInfo + "1", dType) ||
                        temp.startsWith("uint") && root.treeInfo.equals("-")
                ) {
                    throw new VariableTypeConflictException();
                }

            case 2://˫Ŀ�����
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
                        !n.treeInfo.startsWith("[[")) {//��������
                    dType = n.treeInfo.substring(1, n.treeInfo.indexOf("]"));
                } else if (n.treeInfo.startsWith("[[")) {//scoped_name ����
                    dType = n.treeInfo.substring(2, n.treeInfo.indexOf("]]"));
                } else {//������ID
                    SymbolMap.insertName(n.treeInfo, dType);
                    if (!n.children.isEmpty()) {//�и�ֵ���
                        n.setType(dType);
                        semanticCheck(n.children.get(1));//todo �д� debug����������ε�����
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
     * ����һ��������Ϊ {length} * 2 ���ո���ɵ��ַ���
     *
     * @param length �ַ�������
     * @return ���ɵ��ַ���
     */
    private String lineBuilder(int length) {

        return "  ".repeat(Math.max(0, length));
    }


}
