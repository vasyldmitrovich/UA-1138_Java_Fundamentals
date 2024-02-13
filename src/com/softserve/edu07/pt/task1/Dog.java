package com.softserve.edu07.pt.task1;


public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void feed() {
        System.out.println("Feed:" + true);
    }
}
