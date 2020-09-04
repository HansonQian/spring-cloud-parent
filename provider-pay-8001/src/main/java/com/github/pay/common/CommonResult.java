package com.github.pay.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @className: CommonResult
 * @description: 通用返回结果
 * @author: Hanson
 * @version: V1.0
 * @create: 2020-09-03 23:53
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
