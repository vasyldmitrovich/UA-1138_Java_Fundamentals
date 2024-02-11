package com.softserve.edu06.pt.task2;

class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("The truck " + getModel() + " is running with " + getMaxSpeed() + " speed");
    }

    @Override
    void stop() {
        System.out.println("The truck " + getModel() + " has stopped");
    }
}