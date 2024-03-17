package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int dayNumber;

        System.out.println("Enter the number of the day of the week: ");
        dayNumber = scanner.nextInt();
        PracticalTask2 dayOfWeek = new PracticalTask2();
        dayOfWeek.getByNumber(dayNumber);

    }

    void getByNumber(int dayNumber) {
        if (dayNumber == 1) {
            System.out.println(DayOfWeek.MONDAY.dayOfWeekEng + ", " + DayOfWeek.MONDAY.dayOfWeekUkr);
        } else if (dayNumber == 2) {
            System.out.println(DayOfWeek.TUESDAY.dayOfWeekEng + ", " + DayOfWeek.TUESDAY.dayOfWeekUkr);
        } else if (dayNumber == 3) {
            System.out.println(DayOfWeek.WEDNESDAY.dayOfWeekEng + ", " + DayOfWeek.WEDNESDAY.dayOfWeekUkr);
        } else if (dayNumber == 4) {
            System.out.println(DayOfWeek.THURSDAY.dayOfWeekEng + ", " + DayOfWeek.THURSDAY.dayOfWeekUkr);
        } else if (dayNumber == 5) {
            System.out.println(DayOfWeek.FRIDAY.dayOfWeekEng + ", " + DayOfWeek.FRIDAY.dayOfWeekUkr);
        } else if (dayNumber == 6) {
            System.out.println(DayOfWeek.SATURDAY.dayOfWeekEng + ", " + DayOfWeek.SATURDAY.dayOfWeekUkr);
        } else {
            System.out.println(DayOfWeek.SUNDAY.dayOfWeekEng + ", " + DayOfWeek.SUNDAY.dayOfWeekUkr);
        }
    }

    enum DayOfWeek {//Move to DayOfWeek.java
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П'ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");


        final String dayOfWeekEng;
        final String dayOfWeekUkr;

        DayOfWeek(String dayOfWeekEng, String dayOfWeekUkr) {
            this.dayOfWeekEng = dayOfWeekEng;
            this.dayOfWeekUkr = dayOfWeekUkr;
        }
    }
}
