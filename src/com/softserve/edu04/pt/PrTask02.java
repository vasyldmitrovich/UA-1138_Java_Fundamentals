package com.softserve.edu04.pt;

import java.util.Scanner;

public class PrTask02 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number of a week");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayNumber);
        System.out.println("This number corresponds to " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає такому дню - " + dayOfWeek.ukrainianName);

    }
}

enum DayOfWeek {//Move to file DayOfWeek.java
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "Пʼятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    public final String englishName;
    public final String ukrainianName;

    DayOfWeek (String englishName, String ukrainianName){
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static DayOfWeek getByNumber(int number){//This method move from this class
        return switch (number){
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalArgumentException("There is no such day number in week" + number);
        };
    }
}