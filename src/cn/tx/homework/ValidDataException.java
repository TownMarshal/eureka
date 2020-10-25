package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/2 0002.
 */
public class ValidDataException extends RuntimeException{
    public ValidDataException() {
    }

    public ValidDataException(String message) {
        super(message);
    }

    public ValidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidDataException(Throwable cause) {
        super(cause);
    }

    public ValidDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
