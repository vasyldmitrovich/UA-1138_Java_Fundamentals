package com.softserve.edu07.pt.pt02;

abstract class Staff extends Person {

    protected static final String TYPE_PERSON = "Staff";

    protected Staff(String name) {
        super(name);
    }


    abstract void salary();

    @Override
    void print() {
        System.out.println("I`m a " + getName() +
                ", Type person: " + TYPE_PERSON);
    }
}
