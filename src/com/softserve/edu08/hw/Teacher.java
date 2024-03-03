package com.softserve.edu08.hw;

public class Teacher extends Person {
    private String teacherId;

    public Teacher(FullName fullName, int age, String teacherId) {
        super(fullName, age);
        this.teacherId = teacherId;
    }

    @Override
    public String activity() {
        return "Teaching";
    }
}
