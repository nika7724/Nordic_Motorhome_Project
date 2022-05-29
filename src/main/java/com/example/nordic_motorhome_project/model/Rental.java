package com.example.nordic_motorhome_project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
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
    private double total;
    private int fuel_id;
    private double fuel_fee;
    private int speed_meter_id;
    private int speed_meter;
    private double speed_meter_fee;

    public Rental() {

    }

    public int getRental_id() {
        return rental_id;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getMotorho_id() {
        return motorho_id;
    }

    public String getMotorho_name() {
        return motorho_name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public int getSeason_id() {
        return season_id;
    }

    public double getPrice() {
        return price;
    }

    public int getLocation_id() {
        return location_id;
    }

    public String getLocation_name() {
        return location_name;
    }

    public double getLocation_price() {
        return location_price;
    }

    public int getItem_id() {
        return item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public double getTotal() {
        return total;
    }

    public int getFuel_id() {
        return fuel_id;
    }

       public double getFuel_fee() {
        return fuel_fee;
    }

    public int getSpeed_meter_id() {
        return speed_meter_id;
    }

    public int getSpeed_meter() {
        return speed_meter;
    }

    public double getSpeed_meter_fee() {
        return speed_meter_fee;
    }


    //setter

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setMotorho_id(int motorho_id) {
        this.motorho_id = motorho_id;
    }

    public void setMotorho_name(String motorho_name) {
        this.motorho_name = motorho_name;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public void setLocation_price(double location_price) {
        this.location_price = location_price;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setFuel_id(int fuel_id) {
        this.fuel_id = fuel_id;
    }

       public void setFuel_fee(double fuel_fee) {
        this.fuel_fee = fuel_fee;
    }

    public void setSpeed_meter_id(int speed_meter_id) {
        this.speed_meter_id = speed_meter_id;
    }

    public void setSpeed_meter(int speed_meter) {
        this.speed_meter = speed_meter;
    }

    public void setSpeed_meter_fee(double speed_meter_fee) {
        this.speed_meter_fee = speed_meter_fee;
    }

}