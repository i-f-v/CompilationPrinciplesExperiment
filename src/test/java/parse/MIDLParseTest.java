
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

    public static final String TEST_CASE_HOME = "test\\cases\\";
    public static final String TEST_OUTPUT_HOME = "test\\out\\";

    /**
     * ²âÊÔÀà
     */
    @Test
    public void Test() throws IOException {

        FileWriter writer = null;
        File testCatalog = new File(TEST_CASE_HOME);
        if (testCatalog.isDirectory()) {
            File[] files = testCatalog.listFiles();
            if (files != null && files.length > 0)
                for (File file :
                        files) {
                    if (file.isFile()) {

                        String name = file.getName();
                        try {
                            MIDLLexer lexer =
                                    new MIDLLexer(
                                            new ANTLRInputStream(
                                                    new FileInputStream(file)));
                            MIDLParser parser = new MIDLParser(new CommonTokenStream(lexer));

                            ParseTree tree = parser.specification();
                            ParseTreeWalker walker = new ParseTreeWalker();

                            MIDLParserCSTListener listener = new MIDLParserCSTListener();
                            walker.walk(listener, tree);


                            ASTNode outputTree = listener.getRoot();

                            String out = outputTree.traverse(outputTree, 0);

                            writer = new FileWriter(TEST_OUTPUT_HOME + name.substring(0, name.indexOf("."))
                                    + "_out" + ".txt");

                            writer.write(out);
                        } catch (IOException e) {
                            System.out.println("Invalid file.");
                        } finally {
                            if (writer != null) {
                                writer.close();
                            }
                        }
                    }
                }
        }

    }
}
