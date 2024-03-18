package com.softserve.edu08.hw;

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return fullName + ", Age: " + age;
    }

    public abstract String activity();
}