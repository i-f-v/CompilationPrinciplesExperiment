
package semantics.exceptions;

/**
 * 未定义即使用的异常类型
 *
 * @author i-f-v
 */
public class StructNotDefinedException extends Exception {

    /**
     * 变量命名异常类型<br>
     * {@code 1}， 表示 struct 在引用前未定义 <br>
     * {@code 2}， 表示 struct 的命名空间引用不对 <br>
     */
    int type;

    /**
     * 未定义即使用异常
     *
     * @param type 错误类型<br>
     *             {@code 1}， 表示 struct 在引用前未定义 <br>
     *             {@code 2}， 表示 struct 的命名空间引用不对 <br>
     */
    public StructNotDefinedException(int type) {

        this.type = type;
    }
}
