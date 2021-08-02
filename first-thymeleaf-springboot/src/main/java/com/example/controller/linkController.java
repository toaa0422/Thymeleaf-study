package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class linkController {
    @RequestMapping("/link/test")
    public String doLink(Model model) {
        model.addAttribute("queryStudent", "/query/student");
        return "link";

    }
}
