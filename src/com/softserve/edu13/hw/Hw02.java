package com.softserve.edu13.hw;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Hw02 {
    public static void main(String[] args) {
        String date = "02.29.24";
        boolean isValid = validateDate(date);
        if (isValid){
            System.out.println("The date is valid");
        } else {
            System.out.println("The date is invalid");
        }
    }
    private static boolean validateDate(String dateInput) {
        final var formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            var date = LocalDate.parse(dateInput, formatter);
            return date.format(formatter).equals(dateInput);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
