package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    private static String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println(name + ": Get low salary");
    }

    @Override
    void print() {
        System.out.println(name + ": I am a " + TYPE_PERSON);
    }
}
