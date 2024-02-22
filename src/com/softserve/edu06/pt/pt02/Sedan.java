package com.softserve.edu06.pt.pt02;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " is running at speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " has stops");
    }
}
