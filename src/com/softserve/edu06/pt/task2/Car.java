package com.softserve.edu06.pt.task2;

abstract class Car {
    private final String model;
    private final int maxSpeed;
    private final int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void run();

    abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // public int getYearOfProduction() {
    //     return yearOfProduction;
    //}
}
