package com.softserve.edu08.hw.HW01;

public class Student extends Person {
    private int courseNumber;

    public Student(int age, FullName fullName, int courseNumber) {
        super(age, fullName);
        this.courseNumber = courseNumber;
    }

    public Student(int age, FullName fullName) {
        super(age, fullName);
    }

    public String info() {
        return super.info() + courseNumber;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
