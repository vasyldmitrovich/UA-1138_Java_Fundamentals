package com.softserve.edu07.pt.PT01;

public class Main {
    public static void main(String... args) {
        Animal animals[] = {
                new Cat(),
                new Dog()
        };

        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
