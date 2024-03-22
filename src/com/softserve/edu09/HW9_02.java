package com.softserve.edu09;

import java.util.ArrayList;
import java.util.List;

public class HW9_02 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "group1", 2, 4, 5, 4));
        students.add(new Student("Mike", "group1", 3, 4, 5, 3));
        students.add(new Student("Mark", "group2", 3, 3, 3, 2.8f));
        students.add(new Student("Erik", "group3", 4, 5, 5, 5));
        students.add(new Student("Dirk", "group3", 5, 4, 4, 4));

        System.out.println(students);

        students = promoteOrRemoveStudents(students);
        System.out.println(students);

        printStudents(students, 5);
    }

    private static void printStudents(List<Student> students, int c) {
        System.out.println("Student(s) on the course: " + c);
        for (Student student : students) {
            if (student.getCourse() == c) {
                System.out.println(student.getName());
            }
        }
    }

    private static List<Student> promoteOrRemoveStudents(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.calcAverageGrade() >= 3) {
                if (student.getCourse() < 5) {
                    student.setCourse(student.getCourse() + 1);
                }
                result.add(student);
            }
        }
        return result;
    }
}
