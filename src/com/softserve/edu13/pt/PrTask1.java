package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class PrTask1 {
    public static void main(String[] args) {
        var today = LocalDate.now();
        System.out.println(today.getDayOfWeek());
        var firstModay = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstModay);
    }
}
