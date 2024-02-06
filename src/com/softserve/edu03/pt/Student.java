package com.softserve.edu03.pt;

import java.util.Scanner;
public class Student {
    static final Scanner SCANNER = new Scanner(System.in);
    static private int totalRaring;
    static private int totalStudents;
    private String name;
    private int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
    }

    static public double avgRating() {
        System.out.println(totalRaring);
        System.out.println(totalStudents);
        return totalRaring / (double) totalStudents;
    }

    static public int getTotalRating() {
        return totalRaring;
    }

    public static void printStudentStats() {
        System.out.println("Total rating = " + Student.getTotalRating());
        System.out.println("Average rating = %.2f".formatted(Student.avgRating()));
    }

    public static void promptParameters(Student student) {
        System.out.println("Input name:");
        String name = SCANNER.nextLine();
        student.setName(name);
        System.out.println("Input rating for student '" + student.getName() + "': ");
        int rating = SCANNER.nextInt();
        SCANNER.nextLine();
        student.setRating(rating);
    }

    /**
     * Compare myself with other student by raring
     *
     * @param other - the other student to compare with
     * @return wether i`m better than the other
     */
    public boolean betterStudent(Student other) {
        return rating > other.rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRaring -= this.rating;
        this.rating = rating;
        totalRaring += this.rating;
    }
}
