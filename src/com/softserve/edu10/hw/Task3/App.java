package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vitalii", 1));
        students.add(new Student("Petro", 1));
        students.add(new Student("Andry", 2));
        students.add(new Student("Alex", 2));
        students.add(new Student("Max", 3));

        // Print students
        student.printStudents(students, 1);


        //Students sorted by name
        students.sort(Student::compareByName);
        System.out.println(students);

        //Students sorted by course
        students.sort(Student::compareByCourse);
        System.out.println(students);
    }
}
