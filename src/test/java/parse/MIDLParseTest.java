
package parse;


import astnode.ASTNode;
import gen.MIDLLexer;
import gen.MIDLParser;
import listener.MIDLParserCSTListener;
import listener.exceptions.GrammarException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import semantics.exceptions.NamingConflictException;
import semantics.exceptions.VariableTypeConflictException;
import semantics.util.SymbolMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


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
            if (files != null && files.length > 0) {
                for (File file :
                        files) {
                    if (file.isFile()
                            && file.getName().
                            toLowerCase().endsWith(".txt")) {// ������ .txt �ļ����б���

                        String name = file.getName();
                        try {
                            MIDLLexer lexer =
                                    new MIDLLexer(
                                            new ANTLRInputStream(
                                                    new FileInputStream(file)));
                            MIDLParser parser = new MIDLParser(new CommonTokenStream(lexer));

                            ParseTree tree = parser.specification();

                            if (parser.getNumberOfSyntaxErrors() > 0) {
                                throw new GrammarException();
                            }

                            ParseTreeWalker walker = new ParseTreeWalker();

                            MIDLParserCSTListener listener = new MIDLParserCSTListener();
                            walker.walk(listener, tree);


                            ASTNode outputTree = listener.getRoot();

                            String out = outputTree.traverse(outputTree, 0);

                            //д���ļ�
                            writer = new FileWriter(TEST_OUTPUT_HOME + name.substring(0, name.indexOf("."))
                                    + "_out" + ".txt");
                            System.out.println("�ɹ���ת�����AST·��Ϊ��" + TEST_OUTPUT_HOME + name.substring(0, name.indexOf("."))
                                    + "_out" + ".txt");
                            writer.write(out);

                            //������
                            outputTree.semanticCheck(outputTree);

                            SymbolMap.isScopesAllLegal();

                            System.out.println(TEST_OUTPUT_HOME + name.substring(0, name.indexOf("."))
                                    + "_out" + ".txt" + "�������ͨ��");


                        } catch (IOException e) {
                            System.err.println("Invalid file.");
                        } catch (GrammarException e) {
                            System.err.println("�ļ� " + file.getName() + " ���ִʷ����﷨����");
                        } catch (NamingConflictException e) {
                            System.err.println("��" + e.getPath() +
                                    "�г��ֽṹ��δ�����ʹ�û�scoped_name���÷Ƿ�");
                        } catch (VariableTypeConflictException e) {

                            System.err.println("��" + e.getPath() + "�б������Ͳ�ƥ��");
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
}
