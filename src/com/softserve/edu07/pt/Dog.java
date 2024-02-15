package com.softserve.edu07.pt;

public class Dog implements Animal {
    private String breed;
    private String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Gav, gav!");
    }

    @Override
    public void feed() {
        System.out.println("Time to feed a dog!");
    }
}
