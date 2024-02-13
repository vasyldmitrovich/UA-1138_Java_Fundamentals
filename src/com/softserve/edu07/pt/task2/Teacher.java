package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {
    private static String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println(name + ": Get good salary");
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }
}
