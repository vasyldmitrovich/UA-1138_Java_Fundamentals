package com.softserve.edu10.hw.Task3;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents(List<Student> students, int course) {
        Iterator <Student> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public int compareByName(Student studentToCompare) {
        return this.name.compareTo(studentToCompare.getName());
    }

    public int compareByCourse(Student studentToCompare) {
        return Integer.compare(this.course, studentToCompare.getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
