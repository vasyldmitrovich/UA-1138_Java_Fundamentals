package com.softserve.edu04.hw;

import java.util.Scanner;

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
