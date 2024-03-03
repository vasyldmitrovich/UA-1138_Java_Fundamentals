package com.softserve.edu04.hw;

public class HomeTask04 {//Ok
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.input();

        System.out.println("\nFaculty information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());
    }
}

