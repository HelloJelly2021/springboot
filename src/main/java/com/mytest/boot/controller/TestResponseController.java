package com.mytest.boot.controller;

import com.mytest.boot.bean.Person2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author Yangjiali
 * @create 2021-04-23:05 23:05
 */
//@Controller
public class TestResponseController {

    @ResponseBody
    @GetMapping("/test/user")
    public Person2 getPerson2() {
        Person2 person2 = new Person2();
        person2.setName("Jack");
        person2.setAge(18);
        person2.setBirth(new Date());
        return person2;
    }
}
