package com.softserve.edu08.hw;

public class Student extends Person {
    private String studentId;

    public Student(FullName fullName, int age, String studentId) {
        super(fullName, age);
        this.studentId = studentId;
    }

    @Override
    public String activity() {
        return "Studying";
    }
}