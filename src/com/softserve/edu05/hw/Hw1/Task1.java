package com.softserve.edu05.hw.Hw1;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    public static void task1() {
        Scanner scanner = new Scanner(in);

        // Task 1_1
        System.out.println("Enter the month number");

        int monthNumber = scanner.nextInt();
        Task1.getNumberOfDaysInMonth(monthNumber);
    }

    public static int getNumberOfDaysInMonth(int monthNumber) {
        int[] numberOfDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Invalid month");
            return 0;
        } else {
            System.out.println("This month has " + numberOfDaysInMonth[monthNumber - 1] + " days.");
            return numberOfDaysInMonth[monthNumber - 1];
        }
    }
}
