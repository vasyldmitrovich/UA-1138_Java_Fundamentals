package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.softserve.edu10.hw.Student.printStudents;

public class Hw3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Jack", 2));
        students.add(new Student("David", 3));
        students.add(new Student("Emma", 1));

        printStudents(students,1);
        printStudents(students,2);
        printStudents(students,3);

        System.out.println("Students sorted by name:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println("*".repeat(40));

        System.out.println("Students sorted by course:");
        students.sort(Comparator.comparingInt(Student::getCourse));
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }
    }
}
