package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.List;

public class HwTask3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("John", 8),
                new Student("Alex", 2),
                new Student("Bob", 5),
                new Student("Ann", 3),
                new Student("Kate", 2)
        ));

        Student.printStudents(students, 2);

        System.out.println("Sorting by a name:");
        students.sort(Student::compareTo);
        for (var student : students) {
            System.out.println(student.getName());
        }

        System.out.println("Sorting by a course:");
        students.sort(Student::sortByCourse);
        for (var student : students) {
            System.out.println(student.getCourse() + " " + student.getName());
        }
    }
}
