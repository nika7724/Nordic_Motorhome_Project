package com.example.nordic_motorhome_project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rental {
    @Id
    private int rental_id;
    private int motorho_id;
    private Date start_date;
    private Date end_date;
    private int price_id;
    private int location_id;


    //getter
    public Rental() {

    }

    public int getRental_id() {
        return rental_id;
    }

    public int getMotorho_id() {
        return motorho_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public int getPrice_id() {
        return price_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    //setter

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public void setMotorho_id(int motorho_id) {
        this.motorho_id = motorho_id;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}