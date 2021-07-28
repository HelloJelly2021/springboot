package com.mytest.boot.config;

import com.mytest.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * @author Yangjiali
 * @create 2021-04-16:51 16:51
 */
//@Configuration
public class AdminWebConfig { //implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")                           //拦截所有请求
//                .excludePathPatterns("/", "/login", "/login.html", "/css/**", "/js/**", "/images/**"); //排除静态资源和登录请求
//    }
    // 配置视图跳转
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index2.html").setViewName("index");
//        registry.addViewController("/login.html").setViewName("login");
//    }

//    // 将本地化解析器配置到容器中
//    @Bean
//    public LocaleResolver localeResolver() {
//        return new MyLocaleResolver();
//    }

    // 将视图解析器配置到容器中
//    @Bean
//    public ViewResolver myViewResolver() {
//        return new MyViewResolver();
//    }
//
//    // 自定义一个视图解析器
//    public static class MyViewResolver implements ViewResolver {
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }
}
