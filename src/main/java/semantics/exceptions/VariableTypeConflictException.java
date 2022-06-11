/**
 * FileName: VariableTypeConflictException
 * Author:   i-f-v
 * Date:     2022/6/7 20:51
 * Description:
 */
package semantics.exceptions;

/**
 * @author IFV
 * @create 2022/6/7
 * @since 1.0.0
 */
public class VariableTypeConflictException extends Exception {

    private int exceptionType;

    private String path;

    public VariableTypeConflictException() {

    }

    public VariableTypeConflictException(int exceptionType, String path) {

        this.exceptionType = exceptionType;
        this.path = path;
    }

    public VariableTypeConflictException(String path) {

        this.path = path;
    }

    public int getExceptionType() {
        return exceptionType;
    }

    public String getPath() {
        return path;
    }
}
