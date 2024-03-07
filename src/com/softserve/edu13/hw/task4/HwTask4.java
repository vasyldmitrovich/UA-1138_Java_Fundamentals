package com.softserve.edu13.hw.task4;

import java.time.LocalDate;

public class HwTask4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2003, 12, 01);
        System.out.println(date.getDayOfWeek());
        var afterSixMonths = date.plusMonths(6);
        System.out.println("After 6 months: " + afterSixMonths.getDayOfWeek());
        var afterTwelveMonths = date.plusMonths(12);
        System.out.println("After 12 months: " + afterTwelveMonths.getDayOfWeek());
    }
}
