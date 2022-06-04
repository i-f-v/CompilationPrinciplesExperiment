package astnode;

import semantics.exceptions.VariableNamingConflictException;
import semantics.symblemap.SymbolTable;

import java.util.*;

/**
 * �Զ�������νڵ���
 */
public class ASTNode {

    /**
     * �ڵ�洢���ַ�����<br>
     * ���ɵ� AST �е�������Ч�ڵ�� treeInfo ����Ϊ null������Ϊ��Ӧ���ս����
     */
    String treeInfo;

    String name;
    String type;

    HashMap<String, String> symbolTable;

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
     * �� value ��ֵ��{@link #treeInfo}.
     *
     * @param treeInfo ���촫����ս��
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
                        root.children) {//value����Ϊ��
                    builder.append(traverse(node, depth + 1));
                }
            }
        }
        return builder.toString();
    }

    public ASTNode reformat(ASTNode root, String parentType) {
        ASTNode out;
        out = new ASTNode(root.treeInfo);
        if (!root.children.isEmpty()) {//��Ҷ�ӽڵ�

            if (root.treeInfo.equals("module") || root.treeInfo.equals("struct")) {
                out.type = root.getTreeInfo();
            }
        } else {//Ҷ�ӽڵ�
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

        Queue<ASTNode> traverseQueue = new LinkedList<>();//�����õĶ���
        Queue<ASTNode> scopeMatchQueue = new LinkedList<>();//���δƥ���������module��struct����
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
            } else if (node.treeInfo.equals("{")) {//��ǰmodule��struct������ʼ

            } else if (node.treeInfo.equals("}")) {//��ǰmodule��struct���������

            } else if (node.treeInfo.equals("[")) {

            } else if (node.treeInfo.equals("]")) {

            } else {
                if (!scopeMatchQueue.isEmpty()) {//module��struct��ID
                    ASTNode node1 = scopeMatchQueue.poll();
                    namePath.append(".").append(node.treeInfo);
                    try {
                        symbolTable.insert(namePath.toString(), node1.treeInfo);
                    } catch (VariableNamingConflictException e) {
                        String out = namePath.toString() + " " + node1.treeInfo
                                + " " + "�ڵ�ǰ���������ظ�����";
                        System.err.println();
                        return;
                    }
                } else if (!type.equals("")) {//�������͵�ID

                    namePath.append(node.treeInfo);
                    try {
                        symbolTable.insert(namePath.toString(), type);
                    } catch (VariableNamingConflictException e) {
                        String out = namePath.toString() + " " + type
                                + " " + "�ڵ�ǰ���������ظ�����";
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
     * ����һ��������Ϊ {length} * 2 ���ո���ɵ��ַ���
     *
     * @param length �ַ�������
     * @return ���ɵ��ַ���
     */
    private String lineBuilder(int length) {

        return "  ".repeat(Math.max(0, length));
    }
}
