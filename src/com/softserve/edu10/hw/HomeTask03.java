package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeTask03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mike", 2));
        students.add(new Student("Jake", 3));
        students.add(new Student("Kyle", 2));
        students.add(new Student("Billy", 5));
        students.add(new Student("Bob", 4));

        System.out.println("Original list of students: " + students);

        students.sort(Comparator.comparing(Student::getStudentName));
        System.out.println("\nSorted by name: " + students);

        students.sort(Comparator.comparingInt(Student::getStudyCourse));
        System.out.println("\nSorted by course: " + students);

        Student.printStudents(students, 2);
    }
}
