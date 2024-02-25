package com.softserve.edu04.pt;

import java.util.Scanner;

public class WeekDayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of a week day:");
        int dayWeek = scanner.nextInt();
        dayOfWeek dayOfWeek = WeekDayNumber.dayOfWeek.getByNum(dayWeek);
        System.out.println("This day corresponds to " + dayOfWeek.englishName);
        System.out.println("Цей номер відповідає дню " + dayOfWeek.ukrainianName);

        scanner.close();
    }

    enum dayOfWeek {//Move to file and rename to DayOfWeek.java
        Monday("Monday", "Понеділок"),
        Tuesday("Tuesday", "Вівторок"),
        Wednesday("Wednesday", "Середа"),
        Thursday("Thursday", "Четвер"),
        Friday("Friday", "Пятниця"),
        Saturday("Saturday", "Субота"),
        Sunday("Sunday", "Неділя");
        public final String englishName;
        public final String ukrainianName;

        dayOfWeek(String englishName, String ukrainianName) {
            this.englishName = englishName;
            this.ukrainianName = ukrainianName;
        }

        public static dayOfWeek getByNum(int number) {
            return switch (number) {
                case 1 -> Monday;
                case 2 -> Tuesday;
                case 3 -> Wednesday;
                case 4 -> Thursday;
                case 5 -> Friday;
                case 6 -> Saturday;
                case 7 -> Sunday;
                default -> throw new IllegalStateException("There is no such number in a Week: " + number);
            };
        }
    }
}
