package com.softserve.edu05.hw.Task3;


public class Sedan extends Car {
    public Sedan(int yearProduction, int capacity) {
        super("Sedan", yearProduction, capacity);
    }

    @Override
    void run() {
        System.out.println("Sedan is running.");
    }
}