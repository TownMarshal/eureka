package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/4 0004.
 * ctrl+o
 */
public class ValidPersonException extends Exception{
    public ValidPersonException() {
        super();
    }

    public ValidPersonException(String message) {
        super(message);
    }

    public ValidPersonException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidPersonException(Throwable cause) {
        super(cause);
    }

    protected ValidPersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
