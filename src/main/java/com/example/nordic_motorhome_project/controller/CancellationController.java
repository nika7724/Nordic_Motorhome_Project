package com.example.nordic_motorhome_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CancellationController {
    @GetMapping("/cancelRental")
    public String showCancellation(){
        return "cancellation";
    }
    }
