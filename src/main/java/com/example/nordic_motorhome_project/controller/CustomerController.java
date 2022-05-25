package com.example.nordic_motorhome_project.controller;

import com.example.nordic_motorhome_project.model.Customer;
import com.example.nordic_motorhome_project.services.CustomerNotFoundException;
import com.example.nordic_motorhome_project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/customers")
    public String showCustomerList(Model model) {
        List<Customer> listCustomers = service.listAll();
        model.addAttribute("listCustomers", listCustomers);
        return "customers";
    }

    @GetMapping("/customers/new")
    public String showNewForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("pageTitle","Add New Customer");
        return "customer_form";
    }

    @PostMapping("/customers/save")
    public String saveCustomer(Customer customer, RedirectAttributes ra) {
        service.save(customer);
        ra.addFlashAttribute("message", "The customer has been saved successfully.");
        return "redirect:/customers";
    }

    @GetMapping("/customers/update/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            Customer customer=service.get(id);
            model.addAttribute("customer", customer);
            model.addAttribute("pageTitle","Update Customer (ID: " + id + ")");
            return "customer_form";
        } catch (CustomerNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/customers";
        }

    }
    @GetMapping("/customers/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try {
           service.delete(id);
           ra.addFlashAttribute("message", "The user ID " + " has been deleted.");
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
            ra.addFlashAttribute("message", e.getMessage());
        }
            return "redirect:/customers";
    }
}
