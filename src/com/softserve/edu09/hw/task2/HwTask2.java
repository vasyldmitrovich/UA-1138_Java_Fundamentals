package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.List;

public class HwTask2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Bob", "31", 3);
        student1.addGrade("Math", 3);
        students.add(student1);

        Student student2 = new Student("John", "42", 4);
        student2.addGrade("English", 2);
        students.add(student2);
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("After checking:");
        for (var student : students) {
            student.promoteToNextLevel();
        }
        students.removeIf(student -> student.calculateGrade() < 3.0);
        System.out.println(students);

        for (var student : students) {
            student.printStudents(students, 4);
        }
    }
}
