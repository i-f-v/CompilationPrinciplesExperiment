
package astnode;

import java.util.ArrayList;

/**
 * 自定义的树形节点类
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
     * 遍历{@link ASTNode}下的所有子节点。
     *
     * @param root 当前遍历的根节点。
     * @param depth 当前根节点的深度。<br>
     *              如果节点的{@link ASTNode#value} 属性为{@code null}，则深度于其父节点相同。
     * @return 遍历最终得到的用于展示当前根节点下子节点的字符串
     */
    public String traverse(ASTNode root, int depth) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            if (root.value != null && !root.value.isEmpty()) {//value属性不为空
                builder.append(lineBuilder(depth)).append(root.value).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {//value属性为空
                    builder.append(traverse(node, depth));
                }
            }
        }
        return builder.toString();
    }

    /**
     * 生成一个由数量为 length * 2 个空格组成的字符串
     *
     * @param length 字符串长度
     * @return 生成的字符串
     */
    private String lineBuilder(int length) {

        return "  ".repeat(Math.max(0, length));
    }
}
