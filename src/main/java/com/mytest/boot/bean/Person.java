package com.mytest.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Yangjiali
 * @create 2021-04-21:29 21:29
 */
//@ConfigurationProperties(prefix = "person")
@Data
@ToString
public class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> scores;
    private Set<Double> salaries;
    private Map<String, List<Pet>> allPets;
}
