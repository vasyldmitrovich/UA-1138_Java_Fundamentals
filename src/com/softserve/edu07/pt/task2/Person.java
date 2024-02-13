package com.softserve.edu07.pt.task2;

abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
}
