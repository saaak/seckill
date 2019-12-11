package org.seckill.exception;

public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
