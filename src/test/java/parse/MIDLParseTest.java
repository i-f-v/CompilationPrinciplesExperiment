
package parse;


import gen.MIDLLexer;
import gen.MIDLParser;
import gen.MIDLParserBaseListener;
import listener.MIDLParserCSTListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.*;


public class MIDLParseTest {

    public static final String HOME = "C:\\Users\\IFV\\Desktop\\programming projects\\Idea\\CompilationPrinciplesExperiment\\src\\test\\java\\cases\\";

    /**
     * ≤‚ ‘¿‡
     */
    @Test
    public void Test() throws IOException {

        String testFileName = HOME + "1.txt";
        File file = new File(testFileName);
        try {
            MIDLLexer lexer =
                    new MIDLLexer(
                            new ANTLRInputStream(
                                    new FileInputStream(file)));
            MIDLParser parser = new MIDLParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.specification();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new MIDLParserBaseListener(), tree);

            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            System.out.println("Invalid file.");
        }
    }
}
