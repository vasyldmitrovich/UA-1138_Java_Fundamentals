package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 1));
        students.add(new Student("Emily", 2));
        students.add(new Student("Michael", 1));
        students.add(new Student("Emma", 3));
        students.add(new Student("Daniel", 2));

        System.out.println("Sorted by name:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        System.out.println("\nSorted by course:");
        students.sort(Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        Student student = new Student("", 0);
        student.printStudents(students, 2);
    }
}
