package com.softserve.edu12.hw.task1;

import java.util.Scanner;

public class HwTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double secondNumber = scanner.nextDouble();
            double res = div(firstNumber, secondNumber);
            System.out.println(res);
        } catch (Exception e) {//catch specific exception not any Exception
            System.out.println("You cannot divide by zero");
        }

    }

    public static double div(double firstNumber, double secondNumber) throws ArithmeticException {//Good
        if (secondNumber == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        }
        return firstNumber / secondNumber;
    }
}
