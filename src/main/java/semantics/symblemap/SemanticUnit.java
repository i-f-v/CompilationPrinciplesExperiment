/**
 * FileName: SymbolMap
 * Author:   i-f-v
 * Date:     2022/6/3 11:23
 * Description:
 */
package semantics.symblemap;

import semantics.exceptions.VariableNamingConflictException;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ��һ�仰���ܼ�����<br>
 * ����
 *
 * @author IFV
 * @create 2022/6/3
 * @since 1.0.0
 */
public class SemanticUnit {

    /**
     * ���ű�<br>
     * Key Ϊ type;<br>
     * Value Ϊ name��
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


    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addChild(SemanticUnit unit) {
        this.children.add(unit);
    }

    public SemanticUnit getChild(int index){
        return children.get(index);
    }

    public void insert(String name, String type) throws VariableNamingConflictException {
        if (symbols.containsKey(name)) {
            throw new VariableNamingConflictException();
        } else symbols.put(name, type);
    }
}
