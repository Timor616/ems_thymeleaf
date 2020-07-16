package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: timor
 * @date: 2020/7/16 16:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
}
