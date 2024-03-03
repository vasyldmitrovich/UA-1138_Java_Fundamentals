package com.softserve.edu07.pt.Task2;

abstract class Person {
    protected String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Creating " + TYPE_PERSON + " named " + name);
    }

    public abstract void print();
}