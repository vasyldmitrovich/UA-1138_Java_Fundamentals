package com.softserve.edu05.hw;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter the month number: ");
        int monthNomber = scanner.nextInt();

        if (monthNomber >= 1 && monthNomber <= 12) {
            int days = daysInMonth[monthNomber - 1];
            System.out.println("Number of days in month " + monthNomber + ": " + days);
        } else {
            System.out.println("Invalid month number. Enter a number between 1 and 12");
        }
    }
}
