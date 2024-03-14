package com.softserve.edu06.pt;

abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }
}

public class CarModels {//Do not write all this classes in one file here
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Truck("Ford F", 180, 2022);
        cars[1] = new Sedan("Toyota Camry", 150, 2000);

        for (Car car : cars) {
            System.out.println("Model: " + car.model);
            System.out.println("Max speed: " + car.maxSpeed + " km/h");
            System.out.println("Year of production: " + car.yearOfProduction);
            car.run();
            car.stop();
        }
    }
}


