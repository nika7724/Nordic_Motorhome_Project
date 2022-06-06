/*package com.example.nordic_motorhome_project;

import com.example.nordic_motorhome_project.model.Rental;
import com.example.nordic_motorhome_project.repository.RentalRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RentalRepoTest {
@Autowired
    RentalRepo rentalRepo;

@Test
    public void testAddNewRental() {
    Rental rental = new Rental();
    rental.setId(1);
    rental.setMotorho_id(2);
    rental.setStart_date(new Date());
    rental.setEnd_date(new Date());
    rental.setSeason_id(3);
    rental.setLocation_id(2);
    rental.setItem_id(1);
    }

}*/
