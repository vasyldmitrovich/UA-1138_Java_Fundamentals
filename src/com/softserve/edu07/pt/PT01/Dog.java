package com.softserve.edu07.pt.PT01;

public class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("The dog is fed");
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }
}
