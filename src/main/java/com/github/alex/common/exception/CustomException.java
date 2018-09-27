package com.github.alex.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by alex on 2018/9/27.
 * 自定义 exception
 */
@Setter
@Getter
public class CustomException extends Exception {

    private String code;

    public CustomException() {
        super();
    }

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CustomException(String code, String msg) {
        this(msg);
        this.code = code;
    }

    public CustomException(String code, String msg, Throwable cause) {
        this(msg, cause);
        this.code = code;
    }

    public CustomException(ExceptionCode code) {
        this(code.getCode(), code.getMsg());
    }

    public CustomException(ExceptionCode code, Throwable cause) {
        this(code.getCode(), code.getMsg(), cause);
    }
}
