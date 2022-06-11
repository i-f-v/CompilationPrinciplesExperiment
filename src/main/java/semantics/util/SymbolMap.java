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
    private static String fullNameScope = "";//��ǰ��

    /**
     * ����ű��в���һ��������<br>
     *
     * @param name �����ı�������Ϊ��"::"��ʽ
     * @param type ���������͡�Ϊ�����������ͻ�scoped_name���ͣ�scoped_name���Ͱ���"::"��
     * @throws NamingConflictException ������ͻ
     */
    public static void insertName(String name, String type) throws NamingConflictException {
        String tempName;

        if (!fullNameScope.isBlank()) {  //�ҵ�ǰ��Ϊ����
            tempName = fullNameScope + "::" + name;
        } else {
            tempName = name;
        }

        if (containsName(tempName)) {//�����ظ�
            throw new NamingConflictException(1, tempName);
        }

        //���ӵ����ű�
        symbolMap.put(tempName, type);

        //���µ�ǰ��
        if (type.equals("module") ||
                type.equals("struct") ||
                type.equals("struct_in")) {
            fullNameScope = fullNameScope + "::" + name;
        }
    }

    /**
     * ��ȡ��ǰ������������<br>
     * ��ʽΪ "ID" �� "ID::ID::...::ID"
     *
     * @return ��ǰ������������
     */
    public static String getNamingScope() {
        return fullNameScope;
    }

    /**
     * �Ƴ���ǰ������һ�һ����ĳ��{@code listener}��exit�������á�
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
     * �жϵ�ǰ�������Ƿ��Ѿ��ڷ��ű��д��ڡ�
     *
     * @param name Ҫ�жϵı�����
     * @return �жϽ����
     * <br>������ڷ���true�����򷵻�false
     */
    private static boolean containsName(String name) {
        return symbolMap.containsKey(name);
    }


    /**
     * �жϷ��ű��е�scoped_name���������Ƿ�Ϸ���
     * ������Ϸ����׳� {@link NamingConflictException}
     *
     * @throws NamingConflictException �ṹ���scoped_name�������Ϸ�
     */
    public static void isScopesAllLegal() throws NamingConflictException {

        for (String type :
                symbolMap.values()) {
            if (type.contains("::")) {
                if (
                        !(symbolMap.containsKey(type)
                                && (
                                symbolMap.get(type).equals("struct")
                                        || symbolMap.get(type).equals("struct_in")
                        ))
                ) {
                    throw new NamingConflictException(2, type);
                }
            }
        }
    }
}