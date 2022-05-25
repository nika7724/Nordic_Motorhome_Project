package com.example.nordic_motorhome_project.controller;

import com.example.nordic_motorhome_project.services.MotorhoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
    private MotorhoServices motorhoServices;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

}