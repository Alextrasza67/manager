package com.github.alex.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by alex on 2018/9/27.
 */
@AllArgsConstructor
@Getter
public enum ExceptionCode {

    ERROR("999999", "未知异常"),

    ;
    private String code;
    private String msg;
}
