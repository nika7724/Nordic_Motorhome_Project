package com.example.nordic_motorhome_project.controller;

import com.example.nordic_motorhome_project.model.Rental;
import com.example.nordic_motorhome_project.services.RentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RentalController {
    @Autowired
    RentalServices rentalServices;

    @GetMapping("/rental")
    public String rental(Model model) {
        List<Rental> rentalList = rentalServices.fetchAll();
        model.addAttribute("rentals", rentalList);
        return "rental/rental";
    }
}