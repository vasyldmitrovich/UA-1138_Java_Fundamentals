package com.softserve.edu12.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask01 {
    public static void main(String[] args) {
        System.out.println("The result of operation is: " + div());
    }

    public static double div() throws NumberFormatException, ArithmeticException {
        double number1;
        double number2;
        while (true) {
            try {
                number1 = inputNumber("Enter the first number: ");
                number2 = inputNumber("Enter the second number: ");

                if (number2 == 0) {
                    throw new ArithmeticException("Dividing by zero is not allowed.");
                }
                return (number1 / number2);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double inputNumber(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(in);
        double number;
        while (true) {
            try {
                number = Double.parseDouble(scan.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("This is not a number.");
            }
        }
    }
}
