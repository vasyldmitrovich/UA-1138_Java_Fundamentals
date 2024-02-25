package com.softserve.edu07.pt.PT02;

public class Student extends Person {

    private static final String type = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a " + type);
    }
}
