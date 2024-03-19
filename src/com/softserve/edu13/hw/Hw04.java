package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Hw04 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2006, 01, 31);
        outputAfterSixAndTwelveMonth(birthday);
    }

    private static void outputAfterSixAndTwelveMonth(LocalDate birthday) {
        System.out.println(birthday.getDayOfWeek());
        var afterSixMonth = birthday.plusMonths(6);
        System.out.println("After 6 months: " + afterSixMonth.getDayOfWeek());
        var afterTwelveMonth = birthday.plusMonths(12);
        System.out.println("After 12 months: " + afterTwelveMonth.getDayOfWeek());
    }


}
