package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping("/mehmet")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping("/sati")
    public String getRequestMapping3(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/sedat")
    public String getHome(){

        return "home";
    }

    @GetMapping("/sedat2")
    public String getHome2(){

        return "home";
    }

    @PostMapping("/sedat2")
    public String setHome(){

        return "home";
    }

    @GetMapping("/home/{name}")
    public String getHomeWithName(@PathVariable("name") String name){

        System.out.println("name is "+ name);

        return "home";
    }

    @GetMapping("/home/{name}/{role}")
    public String getHomeWithNameAndRole(@PathVariable("name") String name, @PathVariable("role") String role){

        System.out.println("name is "+ name + " and role is "+ role);

        return "home";
    }

    @GetMapping("/home2/course")
    public String requestParam(@RequestParam("course") String course){

        System.out.println("Course is "+ course);

        return "home";
    }

    @GetMapping("/home2/course")
    public String requestParam3(@RequestParam("course") String course){

        System.out.println("Course is "+ course);

        return "home";
    }


    @GetMapping("new/courses")
    public String requestParam2(@RequestParam(value = "courses", required = false, defaultValue = "cybertek") String name){

        System.out.println("name is " + name);
        return "home";

    }
}
