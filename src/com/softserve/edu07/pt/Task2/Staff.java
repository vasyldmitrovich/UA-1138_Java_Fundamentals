package com.softserve.edu07.pt.Task2;

abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    public abstract void salary();
}