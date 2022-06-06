package com.example.nordic_motorhome_project.controller;

import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.services.MotorhoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MotorhoController {
    @Autowired
    MotorhoServices motorhoServices;

    @GetMapping("/motorhome")
    public String motorhome(Model model) {
        List<Motorhome> motorhomeList =motorhoServices.fetchAll();
        model.addAttribute("motorhomes", motorhomeList);
        return "motorhome/motorhome";
    }

    @GetMapping("/addMotorho")
    public String add() {
        return "motorhome/addMotorho";
    }

    @PostMapping("/addMotorho")
    public String addMotorho(@ModelAttribute Motorhome motorhome) {
        motorhoServices.addMotorho(motorhome);
        return "redirect:/motorhome";
    }

    @GetMapping ("/viewMotorho/{id}")
    public String viewMotorho(@PathVariable("id") int id, Model model) {
        model.addAttribute("motorhome", motorhoServices.findMotorhoById(id));
        return "motorhome/viewMotorho";
    }

    @GetMapping("/deleteMotorho/{id}")
    public String deleteMotorho(@PathVariable("id") int id) {
        boolean deleteMotorho = motorhoServices.deleteMotorho(id);
        return "redirect:/motorhome";
    }

    @GetMapping("/editMotorho/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("motorhome", motorhoServices.findMotorhoById(id));
        return "motorhome/editMotorho";
    }

  @PostMapping ("/editMotorho")
    public String editMotorho(@ModelAttribute Motorhome motorho) {
        motorhoServices.updateMotorho(motorho.getMotorho_id(), motorho);
           return "redirect:/motorhome";
}


  }



