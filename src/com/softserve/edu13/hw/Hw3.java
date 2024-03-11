package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Hw3 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 9, 13);

        printDayOfWeek(birthday);
        printDayOfWeek(birthday.plusMonths(6));
        printDayOfWeek(birthday.plusMonths(12));
    }

    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Date: " + date + ", Day of the week: " + dayOfWeek);
    }
}
