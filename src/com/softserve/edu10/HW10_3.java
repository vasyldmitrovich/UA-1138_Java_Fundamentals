package com.softserve.edu10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW10_3 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 5));
        students.add(new Student("John", 3));
        students.add(new Student("John", 4));
        students.add(new Student("Erik", 3));
        students.add(new Student("Mike", 1));

        Student.printStudents(students, 3);

        Collections.sort(students);
        System.out.println(students);
    }
}
