/**
 * FileName: OperatorMap
 * Author:   i-f-v
 * Date:     2022/6/10 19:50
 * Description:
 */
package semantics.util;

import java.util.HashSet;

/**
 * �����ж���������������Ƿ���Ͻ������͡�
 *
 * @author IFV
 * @create 2022/6/10
 * @since 1.0.0
 */
public class OperatorSet {

    private static final HashSet<Pair<String, String>> set = new HashSet<>() {
        {
            //��Ԫ�����
            add(new Pair<>("+", "int"));
            add(new Pair<>("+", "uint"));
            add(new Pair<>("+", "float"));
            add(new Pair<>("+", "string"));
            add(new Pair<>("-", "int"));
            add(new Pair<>("-", "uint"));
            add(new Pair<>("-", "float"));
            add(new Pair<>("*", "int"));
            add(new Pair<>("*", "uint"));
            add(new Pair<>("*", "float"));
            add(new Pair<>("/", "int"));
            add(new Pair<>("/", "uint"));
            add(new Pair<>("/", "float"));
            add(new Pair<>("%", "int"));
            add(new Pair<>("%", "uint"));
            add(new Pair<>(">>", "int"));
            add(new Pair<>(">>", "uint"));
            add(new Pair<>("<<", "int"));
            add(new Pair<>("<<", "uint"));
            add(new Pair<>("|", "int"));
            add(new Pair<>("&", "int"));
            add(new Pair<>("^", "int"));
            //һԪ�����
            add(new Pair<>("+1", "int"));
            add(new Pair<>("+1", "uint"));
            add(new Pair<>("+1", "float"));
            add(new Pair<>("-1", "int"));
            add(new Pair<>("-1", "float"));
            add(new Pair<>("~1", "int"));
            add(new Pair<>("~", "int"));
        }
    };

    public static boolean inOpSet(String op, String type) {

        return set.contains(new Pair<>(op, type));
    }

    public static boolean inOpSet(String op){
        for (Pair<String, String> pair :
                set) {
            if (pair.getA().equals(op)){
                return true;
            }
        }
        return false;
    }
}
