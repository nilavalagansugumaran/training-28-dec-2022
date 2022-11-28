package com.example.demowithintellij;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/sayHello")
    public String sayHollow(@RequestParam String name){

        return "Hello "+ name + "!!!";
    }
}
