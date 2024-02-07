package com.softserve.edu04.pt;

import java.util.Scanner;

public class DayOfWeakLocalization {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input number of weak: ");
        int dayNum = SCANNER.nextInt();
        DayOfWeak dayOfWeak = DayOfWeak.getNum(dayNum);
        System.out.println("This day: " + dayOfWeak.getEn());
        System.out.println("Цей день: " + dayOfWeak.getUa());
    }

}

enum DayOfWeak {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвірг"),
    FRIDAY("Friday", "П`ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String en;
    private final String ua;

    DayOfWeak(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }

    public static DayOfWeak getNum(int numDay) {
        return switch (numDay) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalArgumentException("Wrong number, please input number from 1 to 7");
        };
    }
}

