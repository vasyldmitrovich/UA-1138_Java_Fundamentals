package com.softserve.edu06.pt.task2;

class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
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