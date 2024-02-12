package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class Hw1_1 {// Ok
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(in);
        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number!");
        } else {
            int days = daysInMonth[monthNumber - 1];
            System.out.println("Number of days in month " + monthNumber + " is: " + days);
        }
    }
}
