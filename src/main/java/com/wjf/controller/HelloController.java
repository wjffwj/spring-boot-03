package com.wjf.controller;

import com.wjf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private User user;
    @RequestMapping(value = "hello")
    public String hello(){
        return "hello,world"+user.getPwd();
    }
}
