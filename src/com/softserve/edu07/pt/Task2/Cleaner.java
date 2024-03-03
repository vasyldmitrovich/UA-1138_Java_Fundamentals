package com.softserve.edu07.pt.Task2;

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner.");
    }

    public void salary() {
        System.out.println("Salary of " + name + " is $1000.");
    }
}