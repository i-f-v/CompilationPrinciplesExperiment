/**
 * FileName: SymbolTable
 * Author:   i-f-v
 * Date:     2022/6/4 20:47
 * Description:
 */
package semantics.symblemap;

import semantics.exceptions.VariableNamingConflictException;

import java.util.HashMap;

/**
 * @author IFV
 * @create 2022/6/4
 * @since 1.0.0
 */
public class SymbolTable {

    private static final HashMap<String, String> table = new HashMap<>();

    public void insert(String name, String type) throws VariableNamingConflictException {
        if (table.containsKey(name)){
            throw new VariableNamingConflictException();
        }
        table.put(name, type);
    }
}
