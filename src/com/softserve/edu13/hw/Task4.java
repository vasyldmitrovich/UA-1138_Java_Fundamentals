package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997, 6, 13);
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        System.out.println("Birthday: " + date.getDayOfWeek());

        LocalDate after6Months = date.plusMonths(6);
        System.out.println("After 6 months: " + after6Months.getDayOfWeek());

        LocalDate after12Months = date.plusMonths(12);
        System.out.println("After 12 months: " + after12Months.getDayOfWeek());
    }
}
