package com.how2java.tmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.how2java.tmall.service"})

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
