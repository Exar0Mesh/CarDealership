package com.pluralsight;

public class Vehicle {
    private int vin, year, odometer;
    private String make, model, vehicleType, color;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin; //Vehicle Identification Number
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    //Dont worry about
    //Vehicle is the base code, since you need to pull from this for everything.
}
