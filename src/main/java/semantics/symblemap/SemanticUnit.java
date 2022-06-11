/**
 * FileName: SymbolMap
 * Author:   i-f-v
 * Date:     2022/6/3 11:23
 * Description:
 */
package semantics.symblemap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author IFV
 * @create 2022/6/3
 * @since 1.0.0
 */
public class SemanticUnit {

    /**
     * 符号表。<br>
     * Key 为 type;<br>
     * Value 为 name。
     */
    HashMap<String, String> symbols;
    ArrayList<SemanticUnit> children;
    String type;
    String name;
    String value;

    public SemanticUnit() {
        symbols = new HashMap<>();
        children = new ArrayList<>();
    }

    public SemanticUnit(String name, String type) {
        this.children = new ArrayList<>();
        this.type = type;
        this.name = name;
        if (type.equals("module") || type.equals("struct")) {
            this.symbols = new HashMap<>();
        }
    }

    public SemanticUnit(String name, String type, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public void addChild(SemanticUnit unit){
        this.children.add(unit);
    }
}
