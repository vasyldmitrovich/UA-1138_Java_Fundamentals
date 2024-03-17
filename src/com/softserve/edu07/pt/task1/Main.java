package com.softserve.edu07.pt.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }
    }

}
