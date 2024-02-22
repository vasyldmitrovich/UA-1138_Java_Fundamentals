package com.softserve.edu07.pt.pt01;

public class Cat implements Animal{
    @Override
    public void feed() {
        System.out.println("The cat was fed");
    }

    @Override
    public void voice() {
        System.out.println("Cat says Meow!!!");
    }
}
