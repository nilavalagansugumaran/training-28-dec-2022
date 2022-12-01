package com.example.demoTests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyMvcController {

    @RequestMapping("/hello")
    public String sayHello(Model model){

        model.addAttribute("msg", "Hello there...");
        return "helloView";
    }
}
