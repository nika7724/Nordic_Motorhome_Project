package com.example.nordic_motorhome_project.services;
import com.example.nordic_motorhome_project.model.Motorhome;
import com.example.nordic_motorhome_project.repository.MotorhoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorhoServices {
    @Autowired
    MotorhoRepo motorhoRepo;

    public List<Motorhome> fetchAll() {

        return motorhoRepo.fetchAll();
    }

    public Motorhome addMotorho(Motorhome motorho) {

        return motorhoRepo.addMotorho(motorho);
    }
    public Motorhome findMotorhoById(int id) {

        return motorhoRepo.findMotorhoById(id);
    }

    public Boolean deleteMotorho (int id) {

        return motorhoRepo.deleteMotorho(id);
    }

    public Motorhome updateMotorho(int id, Motorhome motorho) {

        return motorhoRepo.updateMotorho(id, motorho);
    }

}



