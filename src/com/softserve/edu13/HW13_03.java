package com.softserve.edu13;

import java.time.Year;
import java.util.Scanner;

public class HW13_03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();
        System.out.println(isYearLeap(year));
    }

    private static boolean isYearLeap(int year) {
        return Year.isLeap(year);
    }
}
