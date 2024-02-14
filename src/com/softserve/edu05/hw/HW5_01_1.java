package com.softserve.edu05.hw;

import java.util.Scanner;

public class HW5_01_1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println("Enter the month's number: ");
        int monthNumber = SCANNER.nextInt();
        if (monthNumber > 0 && monthNumber < 13) {
            System.out.println("The month # " + monthNumber + " contains " + daysInMonths[monthNumber - 1]);
        } else {
            System.out.println("There are only twelve months in the year. Please, try again and enter correct number");
        }
    }
}
