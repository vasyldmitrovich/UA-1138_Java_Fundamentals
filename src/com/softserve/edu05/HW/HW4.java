package com.softserve.edu05.HW;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response;
        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("Sum: " + sum);

            System.out.print("Do you want to perform the operation again? ");
            response = scanner.next();

        } while (response.equals("yes"));

        System.out.println("Program terminated.");
    }
}
