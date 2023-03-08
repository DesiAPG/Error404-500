package com.example.errorexceptions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/index")
    public String index(Model model) {

        return "index";
    }

    @GetMapping("/clients")
    public String clients(Model model) {

        return "clients";
    }
}
