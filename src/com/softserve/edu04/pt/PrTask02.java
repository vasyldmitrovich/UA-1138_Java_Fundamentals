package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask02 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number of a week");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = getByNumber(dayNumber);
        System.out.println("This number corresponds to " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає такому дню - " + dayOfWeek.ukrainianName);

    }

    public static DayOfWeek getByNumber(int number) {//This method moved from enum DayOfWeek
        return switch (number) {
            case 1 -> DayOfWeek.MONDAY;
            case 2 -> DayOfWeek.TUESDAY;
            case 3 -> DayOfWeek.WEDNESDAY;
            case 4 -> DayOfWeek.THURSDAY;
            case 5 -> DayOfWeek.FRIDAY;
            case 6 -> DayOfWeek.SATURDAY;
            case 7 -> DayOfWeek.SUNDAY;
            default -> throw new IllegalArgumentException("There is no such day number in week" + number);
        };
    }
}

