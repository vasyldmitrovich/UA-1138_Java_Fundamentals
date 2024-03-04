package com.softserve.edu6.hw.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Kiwi("Kiwi "), new Penguin("Penguin "), new Eagle("Eagle "), new Swallow("Swallow ")};

        for (int i = 0; i < birds.length; i++) {
            System.out.print(birds[i].birdName);
            birds[i].fly();
        }
    }

}
