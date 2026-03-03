package com.example.springhello.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseModelController {
    @GetMapping("/v1/members")
    public String getMember(@RequestParam("email") String email,
                             @RequestParam("name") String name,
                             @RequestParam("phone") String phone,
                             Model model) {
        model.addAttribute("email", email);
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        return "memberResult";
    }
}
