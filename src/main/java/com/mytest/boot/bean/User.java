package com.mytest.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Yangjiali
 * @create 2021-04-14:35 14:35
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
}
