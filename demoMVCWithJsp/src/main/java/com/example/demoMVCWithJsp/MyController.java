package com.example.demoMVCWithJsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/sayThankYou")
    public String handleThankYouMessage(Model model){

        model.addAttribute("message", "Thank you for visiting my page...");
        return "thanks";
    }
}
