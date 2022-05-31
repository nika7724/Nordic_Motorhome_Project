/*package com.example.nordic_motorhome_project;

import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.repository.MotorhoRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class MotorhoRepoTest {
    @Autowired
    MotorhoRepo motorhoRepo;

    @Test
    public void testAddNewMotorho() {
        Motorhome motorhome = new Motorhome();
        motorhome.setMotorho_name("SEK");
        motorhome.setBrand_name("Jayco");
        motorhome.setSize("6");
        motorhome.setYear(2022);
        motorhome.setSeason_id(1);
        motorhome.setAvailability("Yes");
    }
}





@Test
    public void testFindMotorhoById() {
    Iterable<Motorhome> motorhomes = (Iterable<Motorhome>) motorhoRepo.findMotorhoById(1);
        assertThat(motorhomes).hasSizeGreaterThan(0);
        for (Motorhome motorhome: motorhomes) {
            System.out.println(motorhome);
        }
    }*/
/*
    @Test
    public void testUpdateMortoho() {
        Integer motorhoId = 1;
        Optional<Motorhome> optionalMotorhome = Optional.ofNullable(motorhoRepo.findMotorhoById(motorhoId));
        Motorhome motorhome = optionalMotorhome.get();
        motorhome.setMotorho_name("SE");
        motorhoRepo.updateMotorho(motorhoId);

        Customer updatedMotorho = motorhoRepo.findMotorhoById(motorhoId).get();
        assertThat(updatedMotorho.getMotorho_name()).isEqualTo("SE");
    }

    @Test
    public void testGetMotor() {
        Integer motorhoId = 1;
        Optional<Motorhome> optionalMotorhome = Optional.ofNullable(motorhoRepo.findMotorhoById(motorhoId));
        assertThat(optionalMotorhome).isPresent();
        System.out.println(optionalMotorhome.get());
    }

    }
*/
