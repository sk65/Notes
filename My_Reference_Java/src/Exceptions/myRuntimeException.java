package Exceptions;

public class myRuntimeException extends RuntimeException {
    public myRuntimeException() {
    }

    public myRuntimeException(String message) {
        super(message);
    }

    public myRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public myRuntimeException(Throwable cause) {
        super(cause);
    }

    public myRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
