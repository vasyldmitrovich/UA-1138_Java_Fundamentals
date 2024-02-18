package com.softserve.edu07.pt;

class Cat implements Animals {

    private String name;
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating!");
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
