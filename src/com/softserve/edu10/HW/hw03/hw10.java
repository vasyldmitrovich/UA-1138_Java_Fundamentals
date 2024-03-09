package com.softserve.edu10.HW.hw03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw10 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 1));
        students.add(new Student("John", 2));
        students.add(new Student("Alex", 1));


        System.out.println("Students sorted by name:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + "Course: " + student.getCourse());
        }

        System.out.println("Students sorted by course:");
        students.sort(Student::compareByCourse);
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + "Course: " + student.getCourse());
        }
    }


}

