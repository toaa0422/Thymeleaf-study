package com.example.controller;

import com.example.vo.School;
import com.example.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpressController {
    @RequestMapping("/var1")
    public String express_var(Model model) {
        model.addAttribute("myname", "zhangsan");
        model.addAttribute("myage", "20");
        Student student = new Student();
        student.setId(1);
        student.setName("wangwu");
        student.setEmail("wangwu@qq.com");
        student.setAge(20);
        model.addAttribute("student", student);


        School school = new School();
        school.setScname("清华大学");
        school.setScaddress("北京");
        student.setMySchool(school);
        return "var1";
    }

    @RequestMapping("i18N")
    public String i18n(Model model) {
        return "login";
    }
}
