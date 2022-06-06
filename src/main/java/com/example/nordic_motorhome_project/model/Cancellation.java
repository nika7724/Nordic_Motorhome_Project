package com.example.nordic_motorhome_project.model;
public class Cancellation {
    private double rentalPrice;
    private double priorDays;

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public double getPriorDays() {
        return priorDays;
    }

    public void setPriorDays(double priorDays) {
        this.priorDays = priorDays;
    }
    public double getFeeTotal(){
        if(priorDays>=50){
            System.out.println((rentalPrice*0.2)+rentalPrice);
        } else if(priorDays>=15 && priorDays<=49){
            System.out.println((rentalPrice*0.5)+rentalPrice);
        } else if(priorDays<15 && priorDays>=1){
            System.out.println((rentalPrice*0.8)+rentalPrice);
        }else if(priorDays<1){
            System.out.println((rentalPrice*0.95)+rentalPrice);
        }
        return getFeeTotal();
    }
    }
