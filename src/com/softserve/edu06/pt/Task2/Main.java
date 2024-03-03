package com.softserve.edu06.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Ford Ranger", 180, 2010),
                new Sedan("Toyota Corolla", 200, 2015),
                new Truck("Chevrolet Colorado", 170, 2012),
                new Sedan("Honda Accord", 190, 2018)
        };

        System.out.println("Information about cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}