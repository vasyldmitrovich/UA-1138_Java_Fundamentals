package com.softserve.edu06.pt.Task2;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("The Sedan was run");
    }

    @Override
    public void stop() {
        System.out.println("The Sedan was stopped");
    }
}
