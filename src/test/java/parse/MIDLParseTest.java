
package parse;


import astnode.ASTNode;
import gen.MIDLLexer;
import gen.MIDLParser;
import gen.MIDLParserBaseListener;
import gen.MIDLParserBaseVisitor;
import listener.MIDLParserCSTListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;


public class MIDLParseTest {

    public static final String HOME = "testcases\\";

    /**
     * 测试类
     */
    @Test
    public void Test() throws IOException {

        String testFileName = HOME + "test_grammar.txt";
        File file = new File(testFileName);
        try {
            MIDLLexer lexer =
                    new MIDLLexer(
                            new ANTLRInputStream(
                                    new FileInputStream(file)));
            MIDLParser parser = new MIDLParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.specification();
            ParseTreeWalker walker = new ParseTreeWalker();

            MIDLParserCSTListener listener = new MIDLParserCSTListener();
            walker.walk(listener, tree);//todo 返回的outputTree为空


            ASTNode outputTree = listener.getRoot();

            String out = outputTree.traverse(outputTree, 0);

            System.out.println(out);
        } catch (IOException e) {
            System.out.println("Invalid file.");
        }
    }
}
