package com.linuxea.sell.exception;

/**
 * sell basic exception
 * create by linuxea 11/1/17
 */
public class SellException extends RuntimeException {

    public SellException() {
        super();
    }

    public SellException(String message) {
        super(message);
    }

    public SellException(String message, Throwable cause) {
        super(message, cause);
    }

    public SellException(Throwable cause) {
        super(cause);
    }

    protected SellException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
