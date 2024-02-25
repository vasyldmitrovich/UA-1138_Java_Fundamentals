package com.softserve.edu07.pt.PT02;

public class Cleaner extends Staff {

    private static final String type = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a " + type);
    }

    @Override
    int salary() {
        return 5000;
    }
}
