package com.softserve.edu03.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {

        // Task 1
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
        System.out.println("The average of " + first + " and " + second + " is " + average);

        // Task 2
        Employee employee1 = new Employee("Vitalii", 5, 140);
        Employee employee2 = new Employee("Petya", 3, 150);
        Employee employee3 = new Employee("Sasha", 7, 161);
        System.out.println(Employee.getTotalSum());
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static double getAverage(int first, int second) {
        return (getTotal(first, second) / 2.0);
    }

    private static int getTotal(int first, int second) {
        return first + second;
    }
}
