package com.softserve.edu07.pt.pt01;

public class Pt01 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog()
        };

        for (var animal : animals){
            animal.feed();
            animal.voice();
        }
    }
}
