/**
 * FileName: NamingConflictException
 * Author:   i-f-v
 * Date:     2022/6/7 10:30
 * Description:
 */
package semantics.exceptions;

/**
 * @author IFV
 * @create 2022/6/7
 * @since 1.0.0
 */
public class NamingConflictException extends Exception {

    /**
     * 1, ��ʾͬһ�������������ظ���
     * 2, ��ʾ�ṹ��δ���弴ʹ�á�
     */
    private final int exceptionType;

    private String path;

    public NamingConflictException(int exceptionType) {
        this.exceptionType = exceptionType;
    }

    public NamingConflictException(int exceptionType, String path) {
        this.exceptionType = exceptionType;
        this.path = path;
    }

    public int getExceptionType() {
        return exceptionType;
    }

    public String getPath() {
        return path;
    }
}
