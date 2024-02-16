package com.softserve.edu06.pt;

public class Pt1 {
    public static void main(String[] args) {//Ok
        Car[] cars = {
                new Truck("Ford", 180, 2020),
                new Sedan("Toyota", 160, 2019),
                new Sedan("Honda", 150, 2021)
        };

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}

abstract class Car {
    protected String model;//Make private
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();//This methods after getters and setters

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = '" + model + '\'' +
                ", maxSpeed = " + maxSpeed +
                ", yearOfProduction = " + yearOfProduction +
                '}';
    }
}

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }
}

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped.");
    }
}




