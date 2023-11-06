package com.nbjy.nbjyadmin.util;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Result<T> implements Serializable {
    private int resultCode;
    private String message;
    private T data;
    public Result() {

    }

    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
