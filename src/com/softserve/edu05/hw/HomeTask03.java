package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask03 {
    public static void main(String[] args) {//Good
        Car[] cars = new Car[4];

        cars[0] = new Car("Sedan", 2015, 2.0);
        cars[1] = new Car("Hybrid", 2023, 2.2);
        cars[2] = new Car("Coupe", 2020, 4.0);
        cars[3] = new Car("SUV", 2005, 1.6);

        int modelYear = inputModelYear();

        findCarByYear(cars, modelYear);
        sortCarsByYear(cars);

        System.out.println("\nCars sorted by model year: ");
        printCars(cars);
    }

    private static int inputModelYear() {
        System.out.println("Enter the certain model year: ");
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

    private static void findCarByYear(Car[] cars, int year) {
        System.out.println("Cars of the model year " + year + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car);
                break;
            }
        }
    }

    private static void sortCarsByYear(Car[] cars) {
        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
