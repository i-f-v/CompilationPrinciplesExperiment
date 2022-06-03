
package parse;


import astnode.ASTNode;
import gen.MIDLLexer;
import gen.MIDLParser;
import listener.MIDLParserCSTListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;


/**
 * �����ࡣ
 */
public class MIDLParseTest {

    /**
     * ���������Ĵ洢·��
     */
    public static final String TEST_CASE_HOME = "test\\cases\\";
    /**
     * �������Ĵ洢·��
     */
    public static final String TEST_OUTPUT_HOME = "test\\out\\";

    /**
     * ���Է�����<br>
     * ��Ŀ¼ test/cases/ �����е�.txt�ļ�ִ��{@link MIDLParserCSTListener}�ı���������<br>
     * �������������������ļ�����Ϊ"xxx_out.txt"��������Ŀ¼ test/out/�¡�
     */
    @Test
    @SuppressWarnings("deprecation")
    public void Test() throws IOException {

        FileWriter writer = null;
        File testCatalog = new File(TEST_CASE_HOME);
        if (testCatalog.isDirectory()) {
            File[] files = testCatalog.listFiles();
            if (files != null && files.length > 0)
                for (File file :
                        files) {
                    if (file.isFile()
                            && file.getName().
                            toLowerCase(Locale.ROOT).endsWith(".txt")) {// ������ .txt �ļ����б���

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

                            //д���ļ�
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
