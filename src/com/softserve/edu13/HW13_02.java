package com.softserve.edu13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HW13_02 {
    public static void main(String[] args) {
        System.out.println(validateDate("13.07.24"));
        System.out.println(validateDate("02.29.24"));
    }

    static boolean validateDate(String mmddyy) {
        final var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            var date = LocalDate.parse(mmddyy, formatter);
            return date.format(formatter).equals(mmddyy);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
