package com.softserve.edu07.pt.pt02;

public class Student extends Person {

    protected static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I`m a " + getName() +
                ", Type person: " + TYPE_PERSON);
    }
}
