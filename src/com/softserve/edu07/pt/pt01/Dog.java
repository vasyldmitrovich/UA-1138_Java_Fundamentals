package com.softserve.edu07.pt.pt01;

public class Dog implements Animal{
    @Override
    public void feed() {
        System.out.println("The dog was fed");
    }

    @Override
    public void voice() {
        System.out.println("Dog says Woof!!!");
    }
}
