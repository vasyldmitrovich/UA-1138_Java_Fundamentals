package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        String date = "02.29.24";
        boolean isValid = validateDate(date);
        System.out.println(isValid ? "The date is valid" : "The date is invalid");
    }

    private static boolean validateDate(String dateInput) {
        return isValidWithFormatter(dateInput);
    }

    private static boolean isValidWithFormatter(String dateInput) {
        try {
            LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("MM.dd.yy"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
