package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu09.hw.LowPerformingStudents.removeLowPerformingStudents;

public class main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John", "A", 1, List.of(85, 90, 78)));
        studentList.add(new Student("Jane", "B", 2, List.of(75, 88, 92)));
        studentList.add(new Student("Bob", "A", 3, List.of(60, 70, 65)));


        System.out.println("Students:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " Course: " + student.getCourse() + " Average: " + student.calculateAverage());
        }

        removeLowPerformingStudents(studentList);


        System.out.println("Updated Students:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " Course: " + student.getCourse() + " Average: " + student.calculateAverage());
        }


    }
}

