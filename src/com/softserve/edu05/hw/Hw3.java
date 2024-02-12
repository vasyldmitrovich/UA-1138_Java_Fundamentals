package com.softserve.edu05.hw;


import java.util.Scanner;

import static java.lang.System.in;

public class Hw3 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Hatchback", 2010, 1.8),
                new Car("Sedan", 2000, 3.3),
                new Car("Convertible", 2018, 2.2),
                new Car("Coupe", 1998, 1.1),
                new Car("Truck", 2022, 3.5),
        };

        Scanner scanner = new Scanner(in);
        System.out.println("Enter year of production:");
        int yearOfProduction = scanner.nextInt();
        boolean found = false;
        for (var car: cars){
            if (car.getYearOfProduction() == yearOfProduction){
                System.out.println(car);
                found = true;
            }
        }
        if (!found){
            System.out.println("There are no cars in " + yearOfProduction + " year");
        }

        System.out.println("-".repeat(40));
        sort(cars);
        for (var car: cars) {
            System.out.println(car);
        }
    }

    static void sort(Car[] cars){
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()){
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
    }
}

class Car {//Move to file Car.java
    String type;//Make fields private
    int yearOfProduction;
    double engineCapacity;

    //Add constructor without parameters
    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type = '" + type + '\'' +
                ", yearOfProduction = " + yearOfProduction +
                ", engineCapacity = " + engineCapacity +
                '}';
    }
}
