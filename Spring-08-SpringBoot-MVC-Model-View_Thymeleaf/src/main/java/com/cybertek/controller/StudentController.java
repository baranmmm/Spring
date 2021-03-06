package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "mehmet");
        model.addAttribute("surname", "baran");
        model.addAttribute("id", "12");

        int studentId=new Random().nextInt(1000);

        model.addAttribute("studentId", studentId);

        return "student/welcome";
    }



}
