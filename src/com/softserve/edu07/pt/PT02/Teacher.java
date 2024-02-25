package com.softserve.edu07.pt.PT02;

public class Teacher extends Staff {

    private static final String type = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a " + type);
    }

    @Override
    int salary() {
        return 10000;
    }
}
