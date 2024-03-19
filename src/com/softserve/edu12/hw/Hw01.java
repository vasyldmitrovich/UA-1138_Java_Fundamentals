package com.softserve.edu12.hw;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        System.out.println(div(readDouble("Enter a: "), readDouble("Enter b: ")));
    }

    private static double div(double a, double b) {
        while (true) {
            try {
                return a / b;
            } catch (NumberFormatException e) {
                System.out.println("It should be a number");
            }
        }
    }

    private static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                double num = Double.parseDouble(scanner.nextLine());
                if (num == 0) {
                    throw new ArithmeticException("Dividing by zero is not allowed.");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("It should be a number");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

