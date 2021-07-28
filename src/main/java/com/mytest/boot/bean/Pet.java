package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Yangjiali
 * @create 2021-04-14:35 14:35
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private String name;
    private int age;
}
