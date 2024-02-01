package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Faculty {
    private int numberOfStudents;
    private CurrentSeason currentSeason;

    public Faculty (int numberOfStudents, CurrentSeason currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public static Faculty createFaculty() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter amount of students");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a season");
        String season = scanner.nextLine();

        CurrentSeason currentSeason = switch (season) {
            case "Winter" -> CurrentSeason.WINTER;
            case "Spring" -> CurrentSeason.SPRING;
            case "Summer" -> CurrentSeason.SUMMER;
            case "Autumn" -> CurrentSeason.AUTUMN;
            default -> throw new IllegalStateException("Unexpected value: " + season);
        };
        return new Faculty(numberOfStudents, currentSeason);
    }

    public enum CurrentSeason{
        WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");
        private String seasonName;
        CurrentSeason(String seasonName) {
            this.seasonName = seasonName;
        }
        public void printGetSemester() {
            switch (this) {
                case AUTUMN -> System.out.println("First semester");
                case SPRING -> System.out.println("Second semester");
                case SUMMER -> System.out.println("Vacation");
                case WINTER -> System.out.println("Winter exam");
            }
        }

    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
}
