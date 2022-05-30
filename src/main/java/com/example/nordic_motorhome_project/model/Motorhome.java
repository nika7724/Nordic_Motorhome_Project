package com.example.nordic_motorhome_project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
//getter

    public int getMotorho_id() {

        return motorho_id;
    }

    public String getMotorho_name() {
        return motorho_name;
    }

    public String getBrand_name() {

        return brand_name;
    }

    public String getSize() {

        return size;
    }

    public int getYear() {

        return year;
    }

    public int getSeason_id() {
        return season_id;
    }

    public int getPrice_peak() {

        return price_peak;
    }

    public int getPrice_middle() {

        return price_middle;
    }

    public int getPrice_low() {

        return price_low;
    }

    public String getAvailability() {

        return availability;
    }


//setter

    public void setMotorho_id(int motorho_id) {

        this.motorho_id = motorho_id;
    }

    public void setMotorho_name(String motorho_name) {

        this.motorho_name = motorho_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public void setPrice_peak(int price_peak) {
        this.price_peak = price_peak;
    }

    public void setPrice_middle(int price_middle) {
        this.price_middle = price_middle;
    }

    public void setPrice_low(int price_low) {
        this.price_low = price_low;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Motorhome{" +
                "motorho_id=" + motorho_id +
                ", motorho_name='" + motorho_name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", size='" + size + '\'' +
                ", year=" + year +
                ", season_id=" + season_id +
                ", price_peak=" + price_peak +
                ", price_middle=" + price_middle +
                ", price_low=" + price_low +
                ", availability='" + availability + '\'' +
                '}';
    }
}

