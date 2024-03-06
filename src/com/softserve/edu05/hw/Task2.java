package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {//Ok
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = performOperation(num1, num2);

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform the operation again? ");
            answer = scanner.next();

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("Program terminated.");
    }

    private static double performOperation(double num1, double num2) {
        return num1 + num2;
    }
}