package com.softserve.edu10.HW.hw03;

import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
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

    public void print(List<Student> students, int courseNumber) {
        System.out.println(courseNumber);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.getName());
    }

    public int compareByCourse(Student otherStudent) {
        return Integer.compare(this.course, otherStudent.getCourse());
    }
}


