package com.softserve.edu07.pt;

class Student extends Person {
    public static final String TYPE_PERSON = "Student";//You do not use this variable why

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a student - " + getName());
    }

    public void salary() {
        System.out.println("I don't earn money, I'm still studying");
    }
}