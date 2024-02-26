package com.softserve.edu09.hw;

public class Student {
    private int course;
    private int group;
    private String name;
    private int gradeMath;
    private int gradeEnglish;
    private int gradePhysics;

    public Student(int course, int group, String name, int gradeMath, int gradeEnglish, int gradePhysics) {
        this.course = course;
        this.group = group;
        this.name = name;
        this.gradeMath = gradeMath;
        this.gradeEnglish = gradeEnglish;
        this.gradePhysics = gradePhysics;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public int getGradeEnglish() {
        return gradeEnglish;
    }

    public int getGradePhysics() {
        return gradePhysics;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group=" + group +
                ", name='" + name + '\'' +
                ", gradeMath=" + gradeMath +
                ", gradeEnglish=" + gradeEnglish +
                ", gradePhysics=" + gradePhysics +
                '}';
    }
}
