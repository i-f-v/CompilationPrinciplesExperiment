package astnode;

import semantics.SymbolMap;
import semantics.exceptions.NamingConflictException;

import java.util.ArrayList;

/**
 * �Զ�������νڵ���
 */
public class ASTNode {

    /**
     * �ڵ�洢���ַ�����<br>
     * ���ɵ� AST �е�������Ч�ڵ�� value ����Ϊ null������Ϊ��Ӧ���ս����
     */
    String treeInfo;

    String value;
    /**
     * �ڵ�������ӽڵ㡣
     * Ҷ�ӽڵ�� children ����Ϊ empty
     */
    ArrayList<ASTNode> children = new ArrayList<>();

    /**
     * ��Ч�����ڵ���޲ι��졣{@link #treeInfo}���Բ���ʼ����ʼ��Ϊnull��
     */

    private static String currentScope = "";

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
    public void semanticCheck(ASTNode root) throws NamingConflictException {

        if (root.treeInfo == null || root.treeInfo.isEmpty()) {//���ڵ�
            for (ASTNode node :
                    root.children) {
                semanticCheck(node);
            }
            return;
        }
        if (root.children.isEmpty()) {//Ҷ�ӽڵ�

        } else {
            if (root.treeInfo.equals("module")) {//module�ڵ�

                SymbolMap.insertName(
                        root.children.get(0).treeInfo, "module");

                currentScope = SymbolMap.getNamingScope();

                for (int i = 2; i < children.size() - 1; i++) {
                    for (ASTNode node :
                            root.children) {
                        semanticCheck(node);
                    }

                }
            } else if (root.treeInfo.equals("struct")) {//struct�ڵ�

                String name;
                SymbolMap.insertName(
                        root.children.get(0).treeInfo, "module");
                currentScope = SymbolMap.getNamingScope();

                if (root.children.size() > 3) {//�г�Ա��struct

                    for (int i = 2; i < children.size() - 1; i++) {

                        String val = children.get(i).treeInfo;
                        if (val.startsWith("[[")) {//scoped_name�ڵ�
                            name = val.substring(
                                    val.indexOf("[[") + 2,
                                    val.indexOf("]]"));

                        } else if (val.startsWith("[")) {//�������ͽڵ�
                            name = val.substring(
                                    val.indexOf("[") + 1,
                                    val.indexOf("]")
                            );
                        } else {//������

                        }
                    }
                }
            }
        }

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
