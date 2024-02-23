package com.softserve.edu06.pt;

public class PT01 {
    public static void main(String... args) {
        Car[] cars = {new Truck("Man", 100, 2010),
                new Sedan("BMW", 150, 2015)
        };
        for (var car : cars) {
            car.run();
            car.stop();

        }

    }
}

abstract class Car {//All classes should be in separate files
    private String model;
    private int maxSpeed;
    private int yearsOfProduction;

    public Car(String model, int maxSpeed, int yearsOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearsOfProduction = yearsOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearsOfProduction() {
        return yearsOfProduction;
    }


    abstract void run();

    abstract void stop();
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearsOfProduction) {
        super(model, maxSpeed, yearsOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " is running " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " is stopped");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearsOfProduction) {
        super(model, maxSpeed, yearsOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " is running " + getMaxSpeed());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " is stopped");
    }
}