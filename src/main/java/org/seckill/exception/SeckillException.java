package org.seckill.exception;

public class SeckillException extends RuntimeException {
    public SeckillException(String message){
        super(message);
    }

    public SeckillException(String msg,Throwable cause){
        super(msg,cause);
    }
}
