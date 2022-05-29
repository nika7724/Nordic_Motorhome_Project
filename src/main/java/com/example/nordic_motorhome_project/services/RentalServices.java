package com.example.nordic_motorhome_project.services;

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

    public Rental addRental(Rental rental) {

        return rentalRepo.addRental(rental);
    }

    public Rental findRentalById(int id) {

        return rentalRepo.findRentalById(id);
    }

    public Boolean deleteRental (int id) {

        return rentalRepo.deleteRental(id);
    }

    public Rental updateRental(int id, Rental rental) {

        return rentalRepo.updateRental(id, rental);
    }

    public Rental chargeRental(int id, Rental rental) {

        return rentalRepo.chargeRental(id, rental);
    }

}
