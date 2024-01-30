package com.softserve.edu04.hw;

import java.util.Scanner;

public class HwTask4 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введіть кількість студентів на факультеті: ");
        int numberOfStudents = Integer.parseInt(SCANNER.nextLine());
        Faculty faculty = new Faculty(numberOfStudents);
        faculty.printNumber();

        System.out.println("Enter the season (WINTER / SPRING / SUMMER / AUTUMN): ");
        String inputSeason = SCANNER.nextLine();
        System.out.println(Season.getForSeason(inputSeason));
    }
}

class Faculty {
    private final int numberOfStudents;

    public Faculty(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void printNumber() {
        System.out.println("Кількість студентів на факультеті: " + numberOfStudents);
    }
}

enum Season {
    WINTER("Winter exams"), SPRING("Second semester"), SUMMER("Vacation period"), AUTUMN("First semester");
    final String sem;

    Season(String sem) {
        this.sem = sem;
    }

    public String getSem() {
        return sem;
    }

    public static String getForSeason(String inputSeason) {
        return switch (inputSeason.toUpperCase()) {
            case "WINTER" -> WINTER.getSem();
            case "SPRING" -> SPRING.getSem();
            case "AUTUMN" -> AUTUMN.getSem();
            case "SUMMER" -> SUMMER.getSem();
            default -> throw new IllegalArgumentException("Unknown season ");
        };

    }
}