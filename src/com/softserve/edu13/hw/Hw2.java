package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Hw2 {
    public static void main(String[] args) {
        int year1 = 2024;
        int year2 = 2022;

        System.out.println(year1 + " is a leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year: " + isLeapYear(year2));
    }

    public static boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }
}
