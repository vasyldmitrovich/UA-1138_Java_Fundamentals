package com.softserve.edu12.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double secondNumber = scanner.nextDouble();
            double res = div(firstNumber, secondNumber);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is not allowed.");
        }
    }

    public static double div(double firstNumber, double secondNumber) throws ArithmeticException {
        if (secondNumber == 0) {
            throw new ArithmeticException("Dividing by zero is not allowed.");
        }
        return firstNumber / secondNumber;
    }
}