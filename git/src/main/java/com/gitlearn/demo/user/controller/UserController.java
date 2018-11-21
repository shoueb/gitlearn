package com.gitlearn.demo.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 用户管理
 * @Author: admin
 * @Date: 2018/11/21 16:08
 */
@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
