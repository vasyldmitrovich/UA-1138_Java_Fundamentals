package com.softserve.edu05.hw.Task3;

public class Truck extends Car {
    public Truck(int yearProduction, int capacity) {
        super("Truck", yearProduction, capacity);
    }

    @Override
    void run() {
        System.out.println("Truck is running.");
    }
}