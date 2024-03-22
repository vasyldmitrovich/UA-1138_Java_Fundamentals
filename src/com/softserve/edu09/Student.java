package com.softserve.edu09;

public class Student {
    String name;
    String group;
    int course;
    float mathGrade;
    float programmingGrade;
    float philosophyGrade;

    public Student(String name, String group, int course, float mathGrade, float programmingGrade, float philosophyGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.programmingGrade = programmingGrade;
        this.philosophyGrade = philosophyGrade;
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

    public float getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(float mathGrade) {
        this.mathGrade = mathGrade;
    }

    public float getProgrammingGrade() {
        return programmingGrade;
    }

    public void setProgrammingGrade(float programmingGrade) {
        this.programmingGrade = programmingGrade;
    }

    public float getPhilosophyGrade() {
        return philosophyGrade;
    }

    public void setPhilosophyGrade(float philosophyGrade) {
        this.philosophyGrade = philosophyGrade;
    }

    public float calcAverageGrade() {
        return (mathGrade + programmingGrade + philosophyGrade) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathGrade=" + mathGrade +
                ", programmingGrade=" + programmingGrade +
                ", philosophyGrade=" + philosophyGrade +
                '}';
    }
}
