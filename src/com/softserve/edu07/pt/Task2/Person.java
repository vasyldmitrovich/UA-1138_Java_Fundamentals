package com.softserve.edu07.pt.Task2;

public abstract class Person {
    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    abstract void print();
}
