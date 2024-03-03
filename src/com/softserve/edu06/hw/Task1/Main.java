package com.softserve.edu06.hw.Task1;

public class Main {
    public static void main(String[] args) {
        // Create an array of Bird and add different birds to it
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        // Call fly() method for all birds
        for (Bird bird : birds) {
            bird.fly();
        }

        // Output information about each type of created bird
        for (Bird bird : birds) {
            System.out.println("Type: " + bird.getClass().getSimpleName());
            System.out.println("Has feathers: " + (bird.hasFeathers() ? "Yes" : "No"));
            System.out.println("Lays eggs: " + (bird.laysEggs() ? "Yes" : "No"));
            System.out.println();
        }
    }
}