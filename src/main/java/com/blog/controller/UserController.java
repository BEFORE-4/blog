package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/getTest")
    public User getUser(){
        User user = new User();
        user = userService.getUser(7);
//        user.setName("test");
        return user;
    }

    @RequestMapping("/getUser")
    public void add(String id, String name, int age){
        User user = new User();
        user.setAge(age);
        user.setId(Integer.parseInt(id));
        user.setName(name);
        userService.save(user);
    }
}
