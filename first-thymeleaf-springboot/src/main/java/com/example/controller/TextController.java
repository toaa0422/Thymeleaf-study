package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextController {
    @RequestMapping("/text")
    public String doText(Model model) {
        model.addAttribute("info", "语言java和go");
        model.addAttribute("n1", "zhangsan");
        model.addAttribute("n2", "lisi");
        return "text";

    }

}
