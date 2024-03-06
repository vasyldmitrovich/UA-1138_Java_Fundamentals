package com.softserve.edu09.hw.hw02;

import java.util.ArrayList;
import java.util.List;

public class Hw02 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 3, 2, 2));
        students.add(new Student("ALice", 1, 3, 1));
        students.add(new Student("Jojo", 2, 5, 4));
        students.add(new Student("Sin", 7, 1, 3));
        students.add(new Student("foo", 6, 3, 4.3));
        students.add(new Student("boo", 3, 1, 3.7));
        students.add(new Student("Haul", 8, 2, 5));


        System.out.println(Student.removeAverage(students));
        Student.printStudent(students, 3);

    }
}
