/**
 * FileName: Field
 * Author:   i-f-v
 * Date:     2022/6/4 16:33
 * Description:
 */
package semantics.util;

/**
 *
 * @author IFV
 * @create 2022/6/4
 * @since 1.0.0
 */
public class Field {
    String name;
    String type;
    Field next;

    public Field() {
        this.name = null;
        this.type = null;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
