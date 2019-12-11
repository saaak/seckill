package org.seckill.dto;

import lombok.Getter;
import lombok.Setter;

public class SeckillResult<T> {
    //请求是否成功
    private boolean success;
    private T data;
    @Getter
    @Setter
    private String error;

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
