package com.softserve.edu07.pt;

public class Student extends Person {
    public Student(String name) {
        super(name, "Student");
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " + name + ".");
    }
}
