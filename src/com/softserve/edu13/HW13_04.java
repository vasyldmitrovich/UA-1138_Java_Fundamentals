package com.softserve.edu13;

import java.time.LocalDate;

public class HW13_04 {

    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1987, 11, 24);
        System.out.println(birthdate);

        printDaysAfter6And12Months(birthdate);
    }

    private static void printDaysAfter6And12Months(LocalDate birthdate) {
        LocalDate sixMonthsLater = birthdate.plusMonths(6);
        System.out.println(sixMonthsLater.getDayOfWeek());
        LocalDate yearMonthsLater = birthdate.plusMonths(12);
        System.out.println(yearMonthsLater.getDayOfWeek());
    }
}
