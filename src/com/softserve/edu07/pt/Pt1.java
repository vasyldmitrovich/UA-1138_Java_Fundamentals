package com.softserve.edu07.pt;

public class Pt1 {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat("Tom"),
                new Dog("Jack"),
                new Cat("Bob"),
                new Dog("Sara")
        };


        for (Animals animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}

interface Animals {
    void voice();
    void feed();
}