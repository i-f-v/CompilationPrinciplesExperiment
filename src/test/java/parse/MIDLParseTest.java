
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
 * 测试类。
 */
public class MIDLParseTest {

    /**
     * 测试用例的存储路径
     */
    public static final String TEST_CASE_HOME = "test\\cases\\";
    /**
     * 输出结果的存储路径
     */
    public static final String TEST_OUTPUT_HOME = "test\\out\\";

    /**
     * 测试方法。<br>
     * 将目录 test/cases/ 下所有的.txt文件执行{@link MIDLParserCSTListener}的遍历方法，<br>
     * 并将所有用例的生成文件命名为"xxx_out.txt"，保存在目录 test/out/下。
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
                            toLowerCase(Locale.ROOT).endsWith(".txt")) {// 对所有 .txt 文件进行遍历

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

                            //写入文件
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
