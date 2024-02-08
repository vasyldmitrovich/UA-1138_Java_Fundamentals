package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {//Add spaces
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week:");
        int dayOfTheWeek = scanner.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getByNumber(dayOfTheWeek);
        System.out.println("This number corresponds to " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає такому дню: " + dayOfWeek.ukrainianName);
    }
}
enum DayOfWeek {//Move to file DayOfWeek.java
    MONDAY("Monday","Понеділок"),
    TUESDAY("Tuesday","Вівторок"),
    WEDNESDAY("Wednesday","Середа"),
    THURSDAY("Thursday","Четверг"),
    FRIDAY("Friday","П'ятниця"),
    SATURDAY("Saturday","Субота"),
    SUNDAY("Sunday","Неділя");

    public final String englishName;
    public final String ukrainianName;

    DayOfWeek(String englishName, String ukrainianName) {
        this.englishName = englishName;
        this.ukrainianName = ukrainianName;
    }

    public static DayOfWeek getByNumber(int number){//Move to file for example App.java where is main method
        return switch (number){
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SUNDAY;
            case 7 -> SATURDAY;
            default -> throw new IllegalArgumentException(
                    "There is no such day number in a week: " + number);
        };
    }
}
