package com.example.controller;


import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "lisi");
        return "hello";
    }
}
