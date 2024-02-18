package com.softserve.edu07.pt;

class Dog implements Animals {
    private String name;
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " is eating!");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
