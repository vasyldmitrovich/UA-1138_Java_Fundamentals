package com.softserve.edu06.hw.Task1;

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Penguin is not capable of flying.");
    }
}