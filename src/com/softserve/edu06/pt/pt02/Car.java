package com.softserve.edu06.pt.pt02;

abstract class Car {//Nice
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    protected Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    abstract void run();

    abstract void stop();


}
