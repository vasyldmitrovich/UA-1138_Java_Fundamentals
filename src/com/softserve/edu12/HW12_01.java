package com.softserve.edu12;

import java.util.Scanner;

public class HW12_01 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Please enter the first double number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Please enter the second double number: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Dividing result: " + result);
        } catch (Exception e) {
            System.out.println("Exception was caught: " + e.toString());
        }

    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }
}
