package com.softserve.edu10.hw;

import java.util.List;

public class Student {
    private String studentName;
    private int studyCourse;

    public Student(String studentName, int studyCourse) {
        this.studentName = studentName;
        this.studyCourse = studyCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudyCourse() {
        return studyCourse;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nStudents enrolled in course " + course + ":");

        for (Student student : students) {
            if (student.getStudyCourse() == course) {
                System.out.println(student.getStudentName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studyCourse=" + studyCourse +
                '}';
    }
}
