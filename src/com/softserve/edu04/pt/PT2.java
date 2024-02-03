package com.softserve.edu04.pt;

import java.util.Scanner;

public class PT2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input day of the week ");
        int dayNumber = SCANNER.nextInt();
        DayofWeek dayofWeek = DayofWeek.getByNumber(dayNumber);
        System.out.println("This number is for " + dayofWeek.engName );
        System.out.println("Цей номер належить " + dayofWeek.ukrName );

    }
}

enum DayofWeek {
    MONDAY("Monday", "Понеділок"), TUESDAY("Tuesday", "Вівторок"), WEDNESDAY("Wednesday", "Середа"), THURSDAY("Thursday", "Четвер"), FRIDAY("Friday", "Пятниця");
    public final String engName;
    public final String ukrName;

    DayofWeek(String engName, String ukrName) {
        this.engName = engName;
        this.ukrName = ukrName;
    }

    static public DayofWeek getByNumber(int number) {
        return switch (number)
        {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            default -> null;
        };
    }
}
