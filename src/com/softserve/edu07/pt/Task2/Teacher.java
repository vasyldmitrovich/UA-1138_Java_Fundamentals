package com.softserve.edu07.pt.Task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.print("I`m " + name);
    }

    @Override
    double salary() {
        return 14000.23;
    }
}
