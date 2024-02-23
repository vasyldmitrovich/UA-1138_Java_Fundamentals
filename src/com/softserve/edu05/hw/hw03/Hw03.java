package com.softserve.edu05.hw.hw03;

import java.util.Scanner;

public class Hw03 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//All is good
        Car[] array = {
                new Car("Sedan", 2006, 1.9),
                new Car("Hatcback", 2016, 2.0),
                new Car("SUV", 2011, 1.3),
                new Car("Minivan", 2023, 0.6)
        };

        loop(array);
        sort(array);
    }

    public static void loop(Car[] cars) {
        int modelYear = outputModelYear();
        boolean exit = true;
        for (Car car : cars) {
            if (modelYear == car.getYearOfProduction()) {
                System.out.println("Such a car has such a year of manufacture: "
                        + car);
                exit = false;
            }
        }
        if (exit){
            System.out.println("With this year there is no car");
        }
    }

    public static void sort(Car[] cars){
        System.out.println("Sorted cars");
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
        for (var car : cars) {
            System.out.println(car);
        }
    }


    public static int outputModelYear() {
        System.out.println("Input model year: ");
        return scanner.nextInt();
    }
}