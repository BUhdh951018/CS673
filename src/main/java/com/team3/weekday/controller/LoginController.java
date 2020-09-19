package com.team3.weekday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author yangke
 * @title: LoginController
 * @projectName weekday
 * @date 2020-09-14
 */

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session){
        if (StringUtils.isEmpty(username)){// login failure
            return "";
        }

        // login sucessfully
        session.setAttribute("loginUser", username );
        return "redirect:/main";
    }
}
