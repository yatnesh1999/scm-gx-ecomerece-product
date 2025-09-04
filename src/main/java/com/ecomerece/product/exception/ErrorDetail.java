package com.ecomerece.product.exception;

import java.io.Serial;
import java.io.Serializable;

public class ErrorDetail implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String code;

    private final String message;

    public ErrorDetail(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorDetail{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
