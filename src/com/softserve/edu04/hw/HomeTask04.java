package com.softserve.edu04.hw;

import java.util.Scanner;

public class HomeTask04 {//Ok
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.input();

        System.out.println("\nFaculty information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());
    }
}

class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty() {
    }

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public void input() {
        inputNumberOfStudents();
        inputSeason();
    }

    private void inputNumberOfStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        this.numberOfStudents = Integer.parseInt(scanner.nextLine());
    }

    private void inputSeason() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current season (Winter, Spring, Summer, Autumn):");
        this.currentSeason = Season.valueOf(scanner.nextLine().toUpperCase());
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }
}

enum Season {//Move to file Season.java
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getName() {
        return seasonName;
    }
}