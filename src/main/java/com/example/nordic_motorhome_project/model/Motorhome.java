package com.example.nordic_motorhome_project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Motorhome {
    @Id
    private int motorho_id;
    private String motorho_name;
    private String brand_name;
    private String size;
    private int year;
    private int season_id;
    private int price_peak;
    private int price_middle;
    private int price_low;
    private String availability;

    public Motorhome() {
    }

}

