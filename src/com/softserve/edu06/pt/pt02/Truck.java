package com.softserve.edu06.pt.pt02;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " is running at speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " has stops");
    }
}
