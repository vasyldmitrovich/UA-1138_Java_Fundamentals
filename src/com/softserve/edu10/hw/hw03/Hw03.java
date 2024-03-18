package com.softserve.edu10.hw.hw03;

import java.util.ArrayList;
import java.util.List;

public class Hw03 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alice", 1),
                new Student("Bob", 2),
                new Student("Jack", 3),
                new Student("Kate", 3),
                new Student("Nick", 4)
        ));

        Student.printStudents(students, 3);

        System.out.println("Sorting by name: ");
        students.sort(Student::compareTo);
        for (var student : students){
            System.out.print(student.getName() + " ");
        }

        System.out.println();

        System.out.println("Sorting by course: ");
        students.sort(Student::sortCourse);
        for (var student : students){
            System.out.print(student.getCourse() + " ");
        }
    }
}
