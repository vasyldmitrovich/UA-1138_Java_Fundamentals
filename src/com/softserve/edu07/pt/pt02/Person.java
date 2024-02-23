package com.softserve.edu07.pt.pt02;

abstract class Person {//Good
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void print();
}
