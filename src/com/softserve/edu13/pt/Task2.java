package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstMonday = today.withDayOfMonth(1);
        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }
        System.out.println("First Monday of the month: " + firstMonday);
    }
}
