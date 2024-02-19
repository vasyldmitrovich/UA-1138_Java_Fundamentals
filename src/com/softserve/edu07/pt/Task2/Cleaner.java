package com.softserve.edu07.pt.Task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.print("I`m " + name);
    }

    @Override
    double salary() {
        return 83002.44;
    }
}
