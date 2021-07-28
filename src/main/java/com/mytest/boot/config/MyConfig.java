package com.mytest.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.mytest.boot.bean.Car;
import com.mytest.boot.bean.Person;
import com.mytest.boot.bean.Pet;
import com.mytest.boot.bean.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Yangjiali
 * @create 2021-04-14:38 14:38
 */
//@Configuration(proxyBeanMethods = true)
//@EnableConfigurationProperties(value = {Car.class, Person.class})
public class MyConfig {
//    @ConditionalOnBean(name = "tom")
//    @Bean
//    public User user() {
//        return new User("Jelly Yang", 37);
//    }

    @Bean("tom")
    public Pet tomcat() {
        return new Pet("tomcat", 3);
    }
}
