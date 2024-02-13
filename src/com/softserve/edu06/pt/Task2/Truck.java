package com.softserve.edu06.pt.Task2;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("The Truck was run");
    }

    @Override
    public void stop() {
        System.out.println("The Truck was stopped");
    }
}
