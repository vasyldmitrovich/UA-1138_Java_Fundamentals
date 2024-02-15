package com.softserve.edu07.pt;

abstract class Staff extends Person {

    public Staff(String name, String TYPE_PERSON) {
        super(name, TYPE_PERSON);
    }

    public abstract void salary();
}
