package com.example.nordic_motorhome_project.model;

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
    private Date start_date;
    private Date end_date;
    private int season_id;
    private double price;
    private int location_id;
    private String location_name;
    private double total;


    public Rental() {

    }
//getter

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

    public double getTotal() {
        return total;
    }

    //set
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

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rental_id=" + rental_id +
                ", id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", motorho_id=" + motorho_id +
                ", motorho_name='" + motorho_name + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", season_id=" + season_id +
                ", price=" + price +
                ", location_id=" + location_id +
                ", location_name='" + location_name + '\'' +
                ", total=" + total +
                '}';
    }
}