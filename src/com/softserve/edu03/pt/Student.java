package com.softserve.edu03.pt;

import java.util.Scanner;

//If this code not needed, delete it

//        Locale.setDefault(Locale.ROOT);
//        Student.printStudentStats();

//        Student student1 = new Student();
//        Student.promptParameters(student1);
//        Student.printStudentStats();
//
//        Student student2 = new Student();
//        Student.promptParameters(student2);
//        Student.printStudentStats();
//
//        Student student3 = new Student();
//        Student.promptParameters(student3);
//        Student.printStudentStats();

//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
public class Student {
    static final Scanner SCANNER = new Scanner(System.in);
    static private int totalRaring;
    static private int totalStudents;
    private String name;
    private int rating;

    public Student() {
        this("N/A", 0);
    }//This is not needed because this field will have this value by default

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
//        totalRaring += totalRaring;
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
    }//If you want to show execution this method, call this method in main method

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
