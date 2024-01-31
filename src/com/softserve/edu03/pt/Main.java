package com.softserve.edu03.pt;

import java.util.Scanner;

// Task 1
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = getNumber("Enter the first number: ", scanner);
        double second = getNumber("Enter the second number: ", scanner);
        double total = getTotal(first, second);
        double average = getAverage(first, second);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }

    public static double getTotal(double first, double second) {
        return first + second;
    }

    public static double getAverage(double first, double second) {
        return (first + second) / 2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return Double.parseDouble(scanner.next());
    }
}
