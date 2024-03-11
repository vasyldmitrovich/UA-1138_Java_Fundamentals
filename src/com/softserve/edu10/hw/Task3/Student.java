package com.softserve.edu10.hw.Task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.getName());
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }
}

