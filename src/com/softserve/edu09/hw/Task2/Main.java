package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("James", "A", 1);
        student1.addGrade("Math", 4);
        student1.addGrade("English", 3.5);
        students.add(student1);

        Student student2 = new Student("Mario", "B", 2);
        student2.addGrade("Math", 2.5);
        student2.addGrade("English", 3);
        students.add(student2);

        System.out.println("Student records:");
        for (Student student : students) {
            System.out.println(student);
        }

        removeUnderperformingStudents(students);
        promoteStudents(students);

        System.out.println("\nUpdated student records after processing:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudents enrolled in course 2:");
        printStudents(students, 2);
    }

    private static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    private static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.calculateAverageGrade() >= 3.0) {
                student.promoteToNextCourse();
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
