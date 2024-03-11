package com.softserve.edu05.hw.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = {
                new Sedan(2018, 2000),
                new Hatchback(2019, 1800),
                new Truck(2017, 3000)
        };

        System.out.println("All cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.print("\nEnter the year of production to filter cars: ");
        int filterYear = scanner.nextInt();
        System.out.println("Cars of year " + filterYear + ":");
        for (Car car : cars) {
            if (car.getYearProduction() == filterYear) {
                System.out.println(car);
            }
        }

        sortCarsByYear(cars);

        System.out.println("\nSorted cars by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }

    public static void sortCarsByYear(Car[] cars) {
        Arrays.sort(cars, (car1, car2) -> car2.getYearProduction() - car1.getYearProduction());
    }
}