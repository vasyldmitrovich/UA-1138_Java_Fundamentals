package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Pt01_02 {
    public static void main(String[] args) {
        var today = LocalDate.now();
        System.out.println(today.getDayOfWeek());
        var firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
    }
}
