package com.softserve.edu07.pt.task1;

public class PrTask1 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Murka"), new Dog("Sharik")};
        for (var animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
