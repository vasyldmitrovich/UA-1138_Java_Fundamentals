package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        // Task 1
        Task1.task1();

        // Task 2
        Task2.task2();

        // Task 3
        Task3.task3();

        // Task 4
        Employee[] employees = {
                new Employee("Alice", 1, 10000),
                new Employee("Bob", 2, 11000),
                new Employee("Jack", 2, 12000),
                new Employee("John", 3, 14000),
                new Employee("Mark", 3, 13000),

        };
        Task4.task4(employees);

    }
}