package com.softserve.edu05.hw;

import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Hw1.task1();

        Hw2.getSumOfTwoNumbers();

        //Hw3
        Car[] cars ={
                new Car("Ford", 2023, 215),
                new Car("Audi", 2021, 310),
                new Car("BMW", 2023, 400),
                new Car("Toyota", 2019, 136),
        };
        Hw3.getCarByModelYear(2023, cars);
        Hw3.sortCarsByYear(cars);

        Hw4.guessNumber();

    }
}
