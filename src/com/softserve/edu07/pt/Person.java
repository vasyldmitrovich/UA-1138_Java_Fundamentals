package com.softserve.edu07.pt;

abstract class Person {
    protected String name;
    protected String TYPE_PERSON;

    public Person(String name, String TYPE_PERSON) {
        this.name = name;
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public abstract void print();
}
