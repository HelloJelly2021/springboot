package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author Yangjiali
 * @create 2021-04-21:39 21:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person2 {
    private String name;
    private int age;
    private Date birth;
    private Pet pet;
}
