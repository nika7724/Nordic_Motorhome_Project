/*package com.example.nordic_motorhome_project;

import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.repository.MotorhoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class MotorhoRepoTest {
@Autowired private MotorhoRepo motorhoRepo;

@Test
    public void testAddNewMotorho() {
    Motorhome motorhome = new Motorhome();
motorhome.setMotorho_name("SEK");
motorhome.setBrand_name("Jayco");
motorhome.setSize("6");
motorhome.setYear(2022);
motorhome.setPrice_low(140);
motorhome.setPrice_middle(160);
motorhome.setPrice_peak(180);
motorhome.setAvailability("Yes");

Motorhome savedMotorho = motorhoRepo.addMotorho(motorhome);
assertNotNull(savedMotorho);
assertTrue(motorhome.getMotorho_id()>0);
}

}*/
