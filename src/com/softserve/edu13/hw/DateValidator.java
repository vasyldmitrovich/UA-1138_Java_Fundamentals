package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
    public static boolean isValidDateFormat(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String validDate = "12.31.24";
        String invalidDate = "13.32.26";

        System.out.println(validDate + " is valid " + isValidDateFormat(validDate));
        System.out.println(invalidDate + " is valid " + isValidDateFormat(invalidDate));
    }
}
