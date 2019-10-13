package com.how2java.tmall.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class CORSConfiguration extends WebMvcConfigurerAdapter {

    public void addCorsMappings(CorsRegistry registry){
        /**
         * 所有请求都允许跨域
         * **/
         registry.addMapping("/**")
                 .allowedOrigins("*")
                 .allowedMethods("*")
                 .allowedHeaders("*");
    }
}
