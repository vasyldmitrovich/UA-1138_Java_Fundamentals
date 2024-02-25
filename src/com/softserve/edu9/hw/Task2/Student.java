package com.softserve.edu9.hw.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int[] grades;

    public Student() {
    }

    public Student(String name, int group, int course, int[] grades) {
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

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }

        return sumOfGrades/(double)grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}