package com.softserve.edu05.hw.Task3;

public class Hatchback extends Car {
    public Hatchback(int yearProduction, int capacity) {
        super("Hatchback", yearProduction, capacity);
    }

    @Override
    void run() {
        System.out.println("Hatchback is running.");
    }
}