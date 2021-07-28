package com.mytest.boot.config;

import com.mytest.boot.bean.Pet;
import com.mytest.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Yangjiali
 * @create 2021-04-13:40 13:40
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //swagger2
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);
    }
//    @Bean
//    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
//        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
//        hiddenHttpMethodFilter.setMethodParam("_m");
//        return hiddenHttpMethodFilter;
//    }
//
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addFormatters(FormatterRegistry registry) {
//                registry.addConverter(new Converter<String, Pet>() {
//                    @Override
//                    public Pet convert(String s) {
//                        if(!StringUtils.hasText(s)) {
//                            String[] split = s.split(",");
//                            return new Pet(split[0], Integer.parseInt(split[1]));
//                        }
//                        return null;
//                    }
//                })  ;
//            }
//
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginInterceptor())
//                        //拦截所有请求
//                        .addPathPatterns("/**")
//                        //排除静态资源和登录请求
//                        .excludePathPatterns("/", "/login", "/login.html", "/css/**", "/js/**", "/images/**");
//            }
//        };
//    }
}
