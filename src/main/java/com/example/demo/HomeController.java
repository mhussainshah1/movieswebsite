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

    //test
    @RequestMapping("/index1")
    public String index1(){
        return "index1";
    }

    @RequestMapping("/movie1")
    public String movie1(){
        return "movie1";
    }

    @RequestMapping("/movie2")
    public String movie2(){
        return "movie2";
    }

    @RequestMapping("/movie3")
    public String movie3(){
        return "movie3";
    }
}