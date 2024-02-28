package com.softserve.edu10.hw;

import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
    final String name;
    final int course;

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

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students in course " + course + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public int compareTo(Student otherName) {
        return this.name.compareTo(otherName.name);
    }

    public int compareToCourse(Student otherCourse) {
        return Integer.compare(this.course, otherCourse.course);
    }
}
