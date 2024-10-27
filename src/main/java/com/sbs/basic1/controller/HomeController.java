package com.sbs.basic1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    int count ;

    public HomeController () {
        count = -1;
    }

    @GetMapping("/home/main")
    @ResponseBody
    public String showHome() {
        return "안녕하세요";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showHome2() {
        return "환영합니다.";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showHome3() {
        return "Spring Boot Rulls!!.";
    }

    @GetMapping("/home/increase")
    @ResponseBody
    public int showIncrease() {
        count++;
        return count;
    }
}
