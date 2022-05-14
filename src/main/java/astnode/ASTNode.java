
package astnode;

import java.util.ArrayList;

/**
 * �Զ�������νڵ���
 */
public class ASTNode {

    String value;
    ArrayList<ASTNode> children = new ArrayList<>();

    public ASTNode() {
    }

    public ASTNode(String value) {
        this.value = value;
    }

    public void addChild(ASTNode child) {
        if (child.children != null) {
            children.add(child);
        }
    }

    /**
     * ����{@link ASTNode}�µ������ӽڵ㡣
     *
     * @param root ��ǰ�����ĸ��ڵ㡣
     * @param depth ��ǰ���ڵ����ȡ�<br>
     *              ����ڵ��{@link ASTNode#value} ����Ϊ{@code null}����������丸�ڵ���ͬ��
     * @return �������յõ�������չʾ��ǰ���ڵ����ӽڵ���ַ���
     */
    public String traverse(ASTNode root, int depth) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            if (root.value != null && !root.value.isEmpty()) {//value���Բ�Ϊ��
                builder.append(lineBuilder(depth)).append(root.value).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {//value����Ϊ��
                    builder.append(traverse(node, depth));
                }
            }
        }
        return builder.toString();
    }

    /**
     * ����һ��������Ϊ length * 2 ���ո���ɵ��ַ���
     *
     * @param length �ַ�������
     * @return ���ɵ��ַ���
     */
    private String lineBuilder(int length) {

        return "  ".repeat(Math.max(0, length));
    }
}
