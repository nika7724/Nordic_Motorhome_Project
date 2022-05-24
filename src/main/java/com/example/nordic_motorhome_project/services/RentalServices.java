package com.example.nordic_motorhome_project.services;

import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.model.Rental;
import com.example.nordic_motorhome_project.repository.RentalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalServices {
    @Autowired
    RentalRepo rentalRepo;

    public List<Rental> fetchAll() {

        return rentalRepo.fetchAll();
    }

}
