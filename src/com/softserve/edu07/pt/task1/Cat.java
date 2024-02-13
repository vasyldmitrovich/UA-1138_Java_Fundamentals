package com.softserve.edu07.pt.task1;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void feed() {
        System.out.println("Feed:" + false);
    }
}
