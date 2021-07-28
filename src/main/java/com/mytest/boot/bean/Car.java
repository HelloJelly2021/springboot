package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Yangjiali
 * @create 2021-04-16:16 16:16
 */
@Data
@ToString
//@ConfigurationProperties(prefix = "car")
public class Car {
    private String name;
    private float price;
}
