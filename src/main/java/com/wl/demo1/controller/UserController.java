package com.wl.demo1.controller;

import com.wl.demo1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class UserController {
    @GetMapping("/findUserById")
    public User findUserById(String userId){
        User user = new User();
        user.setName("name"+userId);
        user.setCreateTime(new Date());
        System.out.println("xxxx");
        System.out.println("第二个打印输出123ee77771231233333121212qqqwqw");
        return user;
    }
}
