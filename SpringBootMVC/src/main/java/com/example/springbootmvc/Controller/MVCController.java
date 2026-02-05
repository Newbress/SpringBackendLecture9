package com.example.springbootmvc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MVCController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring Boot MVC!";
    }
}
