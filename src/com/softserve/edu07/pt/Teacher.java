package com.softserve.edu07.pt;

class Teacher extends Person {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a teacher - " + name);
    }

    public void salary() {
        System.out.println("I earn 6.000$ per month");
    }
}
