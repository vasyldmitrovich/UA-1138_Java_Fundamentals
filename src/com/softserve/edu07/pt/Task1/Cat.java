package com.softserve.edu07.pt.Task1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Mew");
    }

    @Override
    public void feed() {
        System.out.println("The cat says thanks");
    }
}
