package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        System.out.println("Today is " + dayOfWeek);
    }
}
