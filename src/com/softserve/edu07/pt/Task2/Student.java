package com.softserve.edu07.pt.Task2;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.print("I`m " + name);
    }
}
