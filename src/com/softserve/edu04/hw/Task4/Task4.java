package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

import static java.lang.System.in;

public class Task4 {
    public static void main(String[] args) {
        Faculty faculty = Task4.createFaculty();
        faculty.getCurrentSeason().printGetSemester();
        System.out.println(faculty.getNumberOfStudents());
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
}
