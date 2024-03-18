package com.softserve.edu06.pt.task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Sedan("Kia Rio", 193, 2019),
                new Sedan("Honda Civic", 223, 2023),
                new Truck("Scania Volvo", 110, 2015),
                new Truck("Kenworth Ford", 150, 2021),};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Model: " + cars[i].model +
                    ", Max speed: " + cars[i].maxSpeed +
                    ", Year of production: " + cars[i].yearOfProduction);
        }
    }

}
