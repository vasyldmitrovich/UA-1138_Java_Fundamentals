package com.softserve.edu08.hw;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Jack", "John");
        Person student = new Student(fullName, 18, "S12345");
        Person teacher = new Teacher(fullName, 35, "T98765");

        System.out.println("Student info:");
        System.out.println(student.info());
        System.out.println("Activity: " + student.activity());

        System.out.println("\nTeacher info:");
        System.out.println(teacher.info());
        System.out.println("Activity: " + teacher.activity());
    }
}
