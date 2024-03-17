package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    static Scanner scanner = new Scanner(System.in);
    static int numberOfStudents;//Add access modifier private
    static String seasons;

    public static void main(String[] args) {
        Faculty NumberOfStudents = new Faculty();
        Faculty.input();
        System.out.println("The amount of students at the faculty: " + Faculty.getNumberOfStudents());
        System.out.println(Faculty.getSeason());
    }

    static int getNumberOfStudents() {
        return numberOfStudents;
    }

    static void input() {
        System.out.println("Enter the amount of students at the faculty:");
        numberOfStudents = scanner.nextInt();
        System.out.println("Enter a  season:");
        seasons = scanner.nextLine();
    }

    static String getSeason() {
        if (seasons.toUpperCase().equals("WINTER")) {
            return Season.WINTER.season;
        } else if (seasons.toUpperCase().equals("SPRING")) {
            return Season.SPRING.season;
        } else if (seasons.toUpperCase().equals("SUMMER")) {
            return Season.SUMMER.season;
        } else
            return Season.FALL.season;
    }

    enum Season {//Move to file Season.java
        WINTER("Winter exams period"),
        SPRING("Second semester"),
        SUMMER("Vacation period"),
        FALL("First semester");
        final String season;

        Season(String season) {
            this.season = season;
        }
    }
}
