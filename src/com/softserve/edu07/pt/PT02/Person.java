package com.softserve.edu07.pt.PT02;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();

    public String getName() {
        return name;
    }
}
