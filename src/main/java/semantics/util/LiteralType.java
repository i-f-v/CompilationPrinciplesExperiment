/**
 * FileName: LiteralType
 * Author:   i-f-v
 * Date:     2022/6/4 16:05
 * Description:
 */
package semantics.util;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IFV
 * @create 2022/6/4
 * @since 1.0.0
 */
public class LiteralType {

    public boolean isString(String input) {
        return input.startsWith("\"") && input.endsWith("\"");
    }

    public boolean isChar(String input) {
        return input.startsWith("'") && input.endsWith("'");
    }

    public boolean isBoolean(String input) {
        return input.equals("true")
                || input.equals("TRUE")
                || input.equals("false")
                || input.equals("FALSE");
    }

    public boolean isFloat(String input) {

        //todo
        return true;
    }

    public boolean isInt(String input) {

        //todo
        return true;
    }

    public static boolean isOp(String input) {

        return input.equals("=")
                || input.equals("+")
                || input.equals("-")
                || input.equals("*")
                || input.equals("/")
                || input.equals("~")
                || input.equals("|")
                || input.equals("&")
                || input.equals("^")
                || input.equals("%")
                || input.equals(">>")
                || input.equals("<<");
    }

}
