package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Grade> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>();
    }

    public void addGrade(String subject, double score) {
        grades.add(new Grade(subject, score));
    }

    public double calculateAverageGrade() {
        double sum = 0;
        for (Grade grade : grades) {
            sum += grade.getScore();
        }
        return sum / grades.size();
    }

    public void promoteToNextCourse() {
        course++;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}

