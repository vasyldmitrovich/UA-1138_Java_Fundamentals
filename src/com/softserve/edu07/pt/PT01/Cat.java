package com.softserve.edu07.pt.PT01;

public class Cat implements Animal {


    @Override
    public void feed() {
        System.out.println("The cat is fed");
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
