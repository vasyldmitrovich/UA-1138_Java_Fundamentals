package com.softserve.edu06.pt;

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " is running with max speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " has stopped.");
    }
}
