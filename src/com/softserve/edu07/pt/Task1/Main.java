package com.softserve.edu07.pt.Task1;

public class Main {//ok
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}