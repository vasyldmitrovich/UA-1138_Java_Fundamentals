package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthday {
    private static LocalDate birthday;

    public static void main(String[] args) {

        setBirthday(LocalDate.of(1989, 11, 22));

        printDayOfWeek(birthday);
        printDayOfWeek(birthday.plusMonths(6));
        printDayOfWeek(birthday.plusMonths(12));
    }

    public static void setBirthday(LocalDate date) {
        birthday = date;
    }

    public static void printDayOfWeek(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy (EEEE)");
        String formattedDate = date.format(formatter);

        System.out.println("Date: " + formattedDate);
        System.out.println("Day of the week: " + date.getDayOfWeek());
        System.out.println();

    }
}
