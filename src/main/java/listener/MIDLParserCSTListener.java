
package listener;

import gen.MIDLParser;
import gen.MIDLParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class MIDLParserCSTListener extends MIDLParserBaseListener {


    @Override
    public void exitLiteral(MIDLParser.LiteralContext ctx) {

        System.out.println(ctx.getText());
    }
}
