package com.softserve.edu05.hw;

import com.softserve.edu05.hw.Hw1.Task1;
import com.softserve.edu05.hw.Hw1.Task2;
import com.softserve.edu05.hw.Hw1.Task3;

import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Hw1
        Task1.task1();
        Task2.task2();
        Task3.task3();

        // Hw2
        Hw2.getSumOfTwoNumbers();

        // Hw3
        Car[] cars ={
                new Car("Ford", 2023, 215),
                new Car("Audi", 2021, 310),
                new Car("BMW", 2023, 400),
                new Car("Toyota", 2019, 136),
        };
        Hw3.getCarByModelYear(2010, cars);
        Hw3.sortCarsByYear(cars);

        Hw4.guessNumber();
    }
}
