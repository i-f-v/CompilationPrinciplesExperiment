
package semantics.exceptions;

/**
 * 变量命名的异常类型
 *
 * @author i-f-v
 */
public class VariableNamingConflictException extends Exception {


    /**
     * 变量命名异常
     * <p>
     * {@code 1}， 同一 struct 空间下出现同名变量 <br>
     * {@code 2}， 同一 module 空间下出现同名 struct <br>
     */
    public VariableNamingConflictException() {

    }
}
