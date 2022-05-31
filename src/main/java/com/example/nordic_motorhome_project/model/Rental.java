package com.example.nordic_motorhome_project.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class Rental {
    @Id
    private int rental_id;
    private int id;
    private String first_name;
    private String last_name;
    private int motorho_id;
    private String motorho_name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date;
    private int season_id;
    private double price;
    private int location_id;
    private String location_name;
    private double location_price;
    private int item_id;
    private String item_name;
    private double item_price;
    private int fuel_id;
    private double fuel_fee;
    private int speed_meter_id;
    private int speed_meter;
    private double speed_meter_fee;
    private String availability;
    private double total;

    public Rental() {

    }

}