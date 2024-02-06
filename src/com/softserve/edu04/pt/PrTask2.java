package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of a day of a week: ");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek1 dayOfWeek = DayOfWeek1.getByNumber(dayNumber);//If in method you throw exception use try catch construction here
        System.out.println("This number corresponds to: " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає дню:  " + dayOfWeek.ukrainianName);
    }
}

enum DayOfWeek1 {
    MONDAY("Monday", "понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "Пятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    public final String englishName;
    public final String ukrainianName;

    DayOfWeek1(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static DayOfWeek1 getByNumber(int number) {
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