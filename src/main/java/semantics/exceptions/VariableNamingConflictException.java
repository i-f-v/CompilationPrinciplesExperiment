
package semantics.exceptions;

/**
 * 变量命名的异常类型
 *
 * @author i-f-v
 */
public class VariableNamingConflictException extends Exception {

    /**
     * 变量命名异常类型<br>
     * {@code 1}， 表示同一 struct 空间下出现同名变量 <br>
     * {@code 2}， 表示同一 module 空间下出现同名 struct <br>
     */
    int type;

    /**
     * 变量命名异常
     *
     * @param type 错误类型<br>
     *             {@code 1}， 表示同一 struct 空间下出现同名变量 <br>
     *             {@code 2}， 表示同一 module 空间下出现同名 struct <br>
     */
    public VariableNamingConflictException(int type) {

        this.type = type;
    }
}
