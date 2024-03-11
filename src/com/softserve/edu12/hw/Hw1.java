package com.softserve.edu12.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Hw1 {
    public static void main(String[] args) {
        while (true) {
            try {
                double num1 = readDouble("Enter first number: ");
                double num2 = readDouble("Enter second number: ");


                double div = div(num1 , num2);
                System.out.println("The result of dividing two numbers is " + div);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static double div(double a, double b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException(
                    "The number must not be zero"
            );
        }
        return a / b;
    }

    private static double readDouble(String prompt) {
        Scanner scanner = new Scanner(in);
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }
        }
    }
}
