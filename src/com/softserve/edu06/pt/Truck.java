package com.softserve.edu06.pt;

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("The track " + getModel() + " is running with max speed " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("The track " + getModel() + " has stopped.");
    }
}
