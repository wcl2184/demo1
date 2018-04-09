package com.wl.demo1.service.config;


import com.wl.demo1.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;

@Component
public class TestConfig {
    @Bean
    public UserServiceImpl UserServiceImpl(ViewResolver viewResolver){
        System.out.println("----------------"+viewResolver);
        return new UserServiceImpl();
    }
}
