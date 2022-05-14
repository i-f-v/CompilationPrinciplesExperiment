/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: ASTNode
 * Author:   IFV
 * Date:     2022/5/13 19:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package astnode;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IFV
 * @create 2022/5/13
 * @since 1.0.0
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

    public String traverse(ASTNode root, int depth) {
        StringBuilder builder = new StringBuilder();
        if (root != null) {
            if (root.value != null && !root.value.isEmpty()) {
                builder.append(lineBuilder(depth)).append(root.value).append("\n");
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth + 1));
                }
            } else {
                for (ASTNode node :
                        root.children) {
                    builder.append(traverse(node, depth));
                }
            }
        }
        return builder.toString();
    }

    /**
     * 生成一个由数量为 length 个"_"组成的字符串
     *
     * @param length 字符串长度
     * @return 生成的字符串
     */
    private String lineBuilder(int length) {

        StringBuilder out = new StringBuilder();
        out.append("-".repeat(Math.max(0, length)));
        return out.toString();
    }
}
