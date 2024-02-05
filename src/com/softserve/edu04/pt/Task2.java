package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер дня тижня (1-7): ");
        int dayNumber = scanner.nextInt();
        scanner.close();

        String[] daysOfWeekEnglish = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] daysOfWeekUkrainian = {"Неділя", "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayNameEnglish = daysOfWeekEnglish[dayNumber - 1];
            String dayNameUkrainian = daysOfWeekUkrainian[dayNumber - 1];
            System.out.println("Day of the week (English): " + dayNameEnglish);
            System.out.println("День тижня (українською): " + dayNameUkrainian);
        } else {
            System.out.println("Недійсний номер дня. Будь ласка, введіть число від 1 до 7.");
        }
    }
}