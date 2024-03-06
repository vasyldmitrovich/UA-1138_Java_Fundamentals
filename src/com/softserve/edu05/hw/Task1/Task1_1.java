package com.softserve.edu05.hw.Task1;


import java.util.Scanner;

public class Task1_1 {//Good
    public static void main(String[] args) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Number of days in month " + month + ": " + daysInMonth[month]);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}