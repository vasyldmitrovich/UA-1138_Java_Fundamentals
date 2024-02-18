package com.softserve.edu07.pt;

abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}