package com.softserve.edu09.hw.task2;

import java.util.*;

public class Student {

    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    //This three method move after getters and setters
    public double calculateGrade() {
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void promoteToNextLevel() {
        double avg = calculateGrade();
        if (avg >= 3.0) {
            int currentCourseLevel = course;
            currentCourseLevel++;
            course = currentCourseLevel;
        }
    }

    public void printStudents(List<Student> students, int course) {
        System.out.print("Student names, enrolled in the course " + course + ": ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", group='" + group + '\'' + ", course=" + course + ", grades=" + grades + '}';
    }

}
