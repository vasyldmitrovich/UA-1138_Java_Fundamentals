package com.softserve.edu05.hw;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    String type;
    int yearProduction;
    int engineCapacity;
    Car(String type, int yearProduction, int engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("Sport car", 2020, 800);
        Car car2 = new Car("Pickup truck", 2022, 437);
        Car car3 = new Car("Electric car", 2019, 487);
        Car car4 = new Car("Muscle car", 2023, 760);
        System.out.println("Enter the year of production of the first car: ");
        car1.yearProduction = scanner.nextInt();
        System.out.println("Enter the year of production of the second car: ");
        car2.yearProduction = scanner.nextInt();
        System.out.println("Enter the year of production of the third car: ");
        car3.yearProduction = scanner.nextInt();
        System.out.println("Enter the year of production of the fourth car: ");
        car4.yearProduction = scanner.nextInt();
        int[] sort = {car1.yearProduction, car2.yearProduction, car3.yearProduction, car4.yearProduction};

        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int tmp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] == car1.yearProduction) {
                System.out.println(
                        car1.type +
                                ", year of production " + car1.yearProduction +
                                ", engine capacity " + car1.engineCapacity);
            } else if (sort[i] == car2.yearProduction) {
                System.out.println(
                        car2.type +
                                ", year of production " + car2.yearProduction +
                                ", engine capacity " + car2.engineCapacity);
            } else if (sort[i] == car3.yearProduction) {
                System.out.println(
                        car3.type +
                                ", year of production " + car3.yearProduction +
                                ", engine capacity " + car3.engineCapacity);
            } else if (sort[i] == car4.yearProduction) {
                System.out.println(
                        car4.type +
                                ", year of production " + car4.yearProduction +
                                ", engine capacity " + car4.engineCapacity);
            }
        }
    }


}
