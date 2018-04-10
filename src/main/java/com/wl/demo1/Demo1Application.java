package com.wl.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        for(String name : context.getBeanDefinitionNames()){
            //我添加的
            //第二个

            System.out.println(name);
        }
    }
}
