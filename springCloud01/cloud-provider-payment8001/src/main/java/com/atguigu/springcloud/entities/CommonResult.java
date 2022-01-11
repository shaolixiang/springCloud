package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shaolixiang
 * @create 2021-12-14 11:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
