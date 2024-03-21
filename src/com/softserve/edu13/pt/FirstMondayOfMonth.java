package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstMondayOfMonth {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate firstMondayOfMonth = currentDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println("The first Monday of the current month is: " + firstMondayOfMonth);
    }
}
