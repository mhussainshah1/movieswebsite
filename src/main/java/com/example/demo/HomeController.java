package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/") //or @GetMapping("/index")
    public String index(){
        return "index";
    }



    @RequestMapping("/registration")
    public String registration(){
        return "registration";
    }

    @GetMapping("/intellij")
    public String getIntellij(){
        return "intellij";
    }


    //test
    @RequestMapping("/index1") //or @GetMapping("/index")
    public String index1(){
        return "index1";
    }
}