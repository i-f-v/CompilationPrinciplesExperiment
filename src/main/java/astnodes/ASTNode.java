/**
 * Copyright (C), 2015-2022, XXX���޹�˾
 * FileName: ASTNode
 * Author:   IFV
 * Date:     2022/5/13 19:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package astnodes;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

/**
 * ��һ�仰���ܼ�����<br> 
 * ����
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
