
package semantics.exceptions;

/**
 * 字面量不匹配的异常类型
 *
 * @author i-f-v
 */
public class IncompatibleLiteralException extends Exception {

    /**
     * 变量命名异常类型<br>
     * {@code 1}， 表示赋值两边的类型不匹配 <br>
     * {@code 2}， 表示数据超出范围，如对 int 类型赋值超过 2^31-1  <br>
     * {@code 3}， 表示数组赋值运算中出现类型不匹配  <br>
     */
    int type;

    /**
     * 字面量类型异常
     *
     * @param type 错误类型<p>
     *             {@code 1}， 表示赋值两边的类型不匹配 <br>
     *             {@code 2}， 表示数据超出范围，如对 int 类型赋值超过 2^31-1  <br>
     *             {@code 3}， 表示数组赋值运算中出现类型不匹配  <br>
     */
    public IncompatibleLiteralException(int type) {
        this.type = type;
    }
}
