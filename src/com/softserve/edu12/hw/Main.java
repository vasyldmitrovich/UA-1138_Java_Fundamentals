package com.softserve.edu12.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first double number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second double number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = div(num1, num2);

            System.out.println("The result of the division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter valid double number");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" An error occurred: " + e.getMessage());
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
