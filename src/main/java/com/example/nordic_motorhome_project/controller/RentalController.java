package com.example.nordic_motorhome_project.controller;

import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.model.Rental;
import com.example.nordic_motorhome_project.services.RentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/addRental")
    public String add() {
        return "rental/addRental";
    }

    @PostMapping("/addRental")
    public String addRental(@ModelAttribute Rental rental) {
        rentalServices.addRental(rental);
        return "redirect:/rental";
    }
    @GetMapping ("/viewRental/{id}")
    public String viewRental(@PathVariable("id") int id, Model model) {
        model.addAttribute("rental", rentalServices.findRentalById(id));
        return "rental/viewRental";
    }
    @GetMapping("/deleteRental/{id}")
    public String deleteRental(@PathVariable("id") int id) {
        boolean deleteRental = rentalServices.deleteRental(id);
        return "redirect:/rental";
    }

    @GetMapping("/editRental/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("rental", rentalServices.findRentalById(id));
        return "rental/editRental";
    }

    @PostMapping ("/editRental")
    public String editMotorho(@ModelAttribute Rental rental) {
        rentalServices.updateRental(rental.getRental_id(), rental);
        return "redirect:/rental";
    }

}