/**
 * FileName: TypeSet
 * Author:   i-f-v
 * Date:     2022/6/10 20:32
 * Description:
 */
package semantics.util;

import java.util.HashSet;

/**
 * @author IFV
 * @create 2022/6/10
 * @since 1.0.0
 */
public class TypeSet {

    private static final HashSet<String> typeset = new HashSet<>() {
        {
            add("int8");
            add("int16");
            add("int32");
            add("int64");
            add("uint8");
            add("uint16");
            add("uint32");
            add("uint64");
            add("float");
            add("double");
            add("string");
            add("char");
            add("boolean");
        }
    };

    public static boolean inTypeSet(String s) {
        return typeset.contains(s);
    }

    public static String findType(String value) {
        if (value.startsWith("\"")) {
            return "string";
        } else if (value.startsWith("'")) {
            return "char";
        } else if (value.equalsIgnoreCase("true") ||
                value.equalsIgnoreCase("false")) {
            return "boolean";
        } else if (value.contains(".") ||
                value.toLowerCase().contains("e") ||
                value.toLowerCase().contains("d") ||
                value.toLowerCase().contains("f")) {
            return "float";

        } else {
            return "int";
        }

    }
}
