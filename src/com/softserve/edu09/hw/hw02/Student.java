package com.softserve.edu09.hw.hw02;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private double grades;

    public Student(String name, int group, int course, double grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public static List<Student> removeAverage(List<Student> collectionStudent) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < collectionStudent.size(); i++) {
            if (collectionStudent.get(i).getGrades() >= 3) {
                collectionStudent.get(i).setCourse(collectionStudent.get(i).getCourse() + 1);
                students.add(collectionStudent.get(i));
            }
        }
        return students;
    }

    public static void printStudent(List<Student> collectionStudent, int numCourse) {
        for (int i = 0; i < collectionStudent.size(); i++) {
            if (collectionStudent.get(i).getCourse() == numCourse) {
                System.out.println(collectionStudent.get(i).getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
