/**
 * FileName: Pair
 * Author:   i-f-v
 * Date:     2022/6/10 19:56
 * Description:
 */
package semantics.util;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IFV
 * @create 2022/6/10
 * @since 1.0.0
 */
public class Pair<A, B> {

    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
