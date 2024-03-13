package com.softserve.edu07;

public class PrTask7_01 {
    public static void main(String[] args) {//Good
        Animal[] animals = {
                new Cat(),
                new Dog()
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("The cat eats its jelly food");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("The dog eats some tasty bone");
    }
}
