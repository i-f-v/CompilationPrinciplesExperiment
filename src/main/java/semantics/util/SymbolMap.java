/**
 * FileName: NamingScope
 * Author:   i-f-v
 * Date:     2022/6/7 10:09
 * Description:
 */
package semantics.util;

import semantics.exceptions.NamingConflictException;

import java.util.HashMap;

/**
 * @author IFV
 * @create 2022/6/7
 * @since 1.0.0
 */
public class SymbolMap {

    public static final HashMap<String, String> symbolMap = new HashMap<>();
    private static String fullNameScope = "";//当前域

    /**
     * 向符号表中插入一个变量。<br>
     *
     * @param name 变量的变量名，为无"::"格式
     * @param type 变量的类型。为基本变量类型或scoped_name类型（scoped_name类型包含"::"）
     * @throws NamingConflictException 命名冲突
     */
    public static void insertName(String name, String type) throws NamingConflictException {
        String tempName;

        if (!fullNameScope.isBlank()) {  //且当前域不为根域
            tempName = fullNameScope + "::" + name;
        } else {
            tempName = name;
        }

        if (containsName(tempName)) {//命名重复
            throw new NamingConflictException();
        }

        //添加到符号表
        symbolMap.put(tempName, type);

        //更新当前域
        fullNameScope = fullNameScope + "::" + name;
    }

    /**
     * 获取当前变量的完整域。<br>
     * 格式为 "ID" 或 "ID::ID::...::ID"
     *
     * @return 当前变量的完整域
     */
    public static String getNamingScope() {
        return fullNameScope;
    }

    /**
     * 移除当前域的最后一项，一般在某个{@code listener}的exit方法调用。
     */
    public static void removeName() {
        if (fullNameScope.contains("::")) {
            fullNameScope = fullNameScope.substring(
                    0, fullNameScope.lastIndexOf("::"));
        } else {
            fullNameScope = "";
        }
    }

    /**
     * 判断当前变量名是否已经在符号表中存在。
     *
     * @param name 要判断的变量名
     * @return 判断结果。
     * <br>如果存在返回true；否则返回false
     */
    private static boolean containsName(String name) {
        return symbolMap.containsKey(name);
    }


    /**
     * 判断符号表中的scoped_name变量类型是否合法。
     *
     * @return 是否合法。<br>
     * 如果合法返回true；否则返回false。
     */
    public static boolean isScopesAllLegal() {

        for (String type :
                symbolMap.values()) {
            if (type.contains("::")) {
                if (
                        symbolMap.containsKey(type)
                        && (
                                symbolMap.get(type).equals("struct")
                                || symbolMap.get(type).equals("module")
                )
                ) {
                    return true;
                }
            }
        }
        return false;
    }
}
