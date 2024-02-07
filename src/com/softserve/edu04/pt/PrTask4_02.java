package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask4_02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {//Add spaces for good readable of code
        System.out.println("Enter the number of a day of a week: ");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("This number corresponds to: " + dayOfWeek.engName);
        System.out.println("Цей номер відповідає такому дню: " + dayOfWeek.ukrName);
    }
}

enum DayOfWeek {//Move to file DayOfWeek.java
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    public final String engName;
    public final String ukrName;

    DayOfWeek(String engName, String ukrName) {
        this.engName = engName;
        this.ukrName = ukrName;
    }

    public static DayOfWeek getByNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalArgumentException("There is no such day number in a week: " + number);
        };
    }
}