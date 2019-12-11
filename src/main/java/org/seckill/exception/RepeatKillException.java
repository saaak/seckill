package org.seckill.exception;

public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
