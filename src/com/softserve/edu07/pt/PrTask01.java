package com.softserve.edu07.pt;

public class PrTask01 {//Ok
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Poodle", "Rex", 7),
                new Dog("Buldog", "Axel", 10),
                new Cat("Maine Coon", "Jackie", 3),
                new Cat("Sphinx", "Pushok", 8),
        };
        for (var animal : animals) {
            System.out.println("\n" + animal);
            animal.voice();
            animal.feed();
        }
    }
}
