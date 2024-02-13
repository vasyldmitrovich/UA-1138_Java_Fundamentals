package com.softserve.edu07.pt.task2;

class Student extends Person {

    private static String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }


}
