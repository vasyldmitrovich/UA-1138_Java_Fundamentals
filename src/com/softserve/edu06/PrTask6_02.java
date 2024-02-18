package com.softserve.edu06;

public class PrTask6_02 {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Man", 120, 2012),
                new Sedan("BMW", 180, 2020),
        };
        for (var car : cars) {
            car.run();
            car.stop();
        }
    }
}

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
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

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " is running at speed " +
                getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " has stopped");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " is running at speed " +
                getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " has stopped");
    }
}