package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hw1 {
    public static void main(String[] args) {
        String date1 = "12.31.21";
        String date2 = "13.32.99";

        System.out.println("Date 1 is valid: " + isValidDate(date1));
        System.out.println("Date 2 is valid: " + isValidDate(date2));
    }

    public static boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
