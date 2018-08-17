package com.bootdo.common.utils;

import java.io.Serializable;

/**
 * Restful result
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/15
 */
public class RestResult<T> implements Serializable {

    protected int code;

    protected String message;

    protected Long timestamp;

    protected T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public RestResult<T> code(int code) {
        this.code = code;
        return this;
    }

    public RestResult<T> message(String message) {
        this.message = message;
        return this;
    }

    public RestResult<T> putTimestamp() {
        this.timestamp = Long.valueOf(System.currentTimeMillis());
        return this;
    }

    public RestResult<T> data(T data) {
        this.data = data;
        return this;
    }
}
