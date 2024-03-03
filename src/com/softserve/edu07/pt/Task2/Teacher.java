package com.softserve.edu07.pt.Task2;

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a teacher.");
    }

    public void salary() {
        System.out.println("Salary of " + name + " is $3000.");
    }
}