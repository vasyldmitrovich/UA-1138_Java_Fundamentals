package com.softserve.edu05.hw.task3;

import java.util.Scanner;

public class HwTask3 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a year of production of a car: ");
        int year = Integer.parseInt(SCANNER.nextLine());


        Car car1 = new Car(" sedan", year, 3500);
        car1.setYearProduction(year);
        Car car2 = new Car(" hatchback", 2013, 2000);
        Car car3 = new Car(" bus", 2018, 4000);
        System.out.println("Year of production: " + car1.getYearProduction());

        Car[] cars = {car1, car2, car3};
        Car.sortCars(cars);
        System.out.println("After sorting: ");
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}

