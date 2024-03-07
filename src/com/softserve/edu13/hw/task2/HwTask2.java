package com.softserve.edu13.hw.task2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HwTask2 {
    public static void main(String[] args) {
        System.out.println(validateDate("13.07.24"));
        System.out.println(validateDate("07.13.24"));
    }

    static boolean validateDate(String mmddyy) {
        final var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            var date = LocalDate.parse(mmddyy, formatter);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
