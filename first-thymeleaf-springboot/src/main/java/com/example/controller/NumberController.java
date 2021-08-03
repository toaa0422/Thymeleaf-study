package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {
    @RequestMapping("/number1")
    public String number(Model model) {
        model.addAttribute("n1", 10);
        model.addAttribute("n2", 20);
        return "number";

    }


}
