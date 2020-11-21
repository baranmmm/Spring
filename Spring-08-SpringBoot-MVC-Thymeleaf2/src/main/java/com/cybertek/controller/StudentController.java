package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @GetMapping("/welcome")
    public String welcomePage(Model model){

        model.addAttribute("name", "mehmet");
        model.addAttribute("surname", "baran");

        return "/student/welcome";
    }
}
