package com.baizhi.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: timor
 * @date: 2020/7/16 17:34
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Emp {

    private String id;
    private String name;
    private Double salary;
    private Integer age;
    private Date bir;
}
