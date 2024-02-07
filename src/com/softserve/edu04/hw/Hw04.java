package com.softserve.edu04.hw;

import java.util.Scanner;

public class Hw04 {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Faculty.input(faculty);
        System.out.println(faculty);
    }
}

class Faculty {
    private static final Scanner SCANNER = new Scanner(System.in);
    private int numOfStudents;
    private String season;

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                '}';
    }

    public static void input(Faculty faculty) {
        System.out.println("Input season or semester: ");
        String season = SCANNER.nextLine();
        faculty.setSeason(Season.getName(season).getName());
        System.out.println("Input number of students: ");
        int numStudents = SCANNER.nextInt();
        faculty.setNumOfStudents(numStudents);
    }
}

enum Season {
    WINTER("winter"),
    SPRING("spring"),
    SUMMER("summer"),
    AUTUMN("autumn");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Season getName(String season){
        return switch (season){
            case "winter", "Winter", "Session", "session" -> WINTER;
            case "spring", "Spring", "Second semester", "second semester" -> SPRING;
            case "summer", "Summer", "Holidays", "holidays" -> SUMMER;
            case "autumn", "Autumn", "First semester", "first semester" -> AUTUMN;
            default -> throw new IllegalArgumentException("Input season or a certain semester");
        };
    }
}


