package com.softserve.edu13.hw;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int year = inputYear();
        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is" + (isLeapYear ? "" : " not") + " a leap year");
    }

    private static int inputYear() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a year to check: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year (e.g., 2024): ");
            }
        }
    }
}
