package com.jinx.mybatisplus.entity;

import lombok.Data;

/**
 * @author jinx
 * @date 2018/11/13 15:21
 * Desc:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
