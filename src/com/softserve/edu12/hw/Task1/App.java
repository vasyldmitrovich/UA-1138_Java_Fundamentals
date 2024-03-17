package com.softserve.edu12.hw.Task1;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            try {
                double a = getDoubleNumber("Enter the first number");
                double b = getDoubleNumber("Enter the divisor");

                double result = div(a, b);
                System.out.println("Result of dividion " + a + " to " + b + " is " + result);
                return;
            } catch (IllegalArgumentException e) {
                System.err.println("Error. " + e.getMessage());
            }
        }

    }

    private static double getDoubleNumber(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Only numbers are allowed");
            }
        }
    }

    public static double div(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("An error occurred: dividing by zero is forbidden");
        }
        return a/b;
    }
}
