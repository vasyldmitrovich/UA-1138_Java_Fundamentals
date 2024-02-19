package com.softserve.edu08.hw;

public class HomeTask02 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(new FullName("Mark", "Jacobs"), 19, 2),
                new Student(new FullName("Jenny", "Jons"), 22, 5),
        };
        for (var student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
        }

        Student[] studentClone = students.clone();
        studentClone[0].setCourse(3);

        for (var student : studentClone) {
            System.out.println(student.info());
            System.out.println(student.activity());
        }
    }
}
