package com.example.nordic_motorhome_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {
        @GetMapping("/result")
        public String showResult(){
            return "cancellationResult";
        }

}
