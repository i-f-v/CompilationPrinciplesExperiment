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
package astnodes;

import org.antlr.v4.runtime.ParserRuleContext;

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

    public void addChild(ASTNode child){
        if (child.children != null && !child.children.isEmpty()){
            children.add(child);
        }
    }

    public boolean isTerminal(){
        return children.isEmpty();
    }
}
