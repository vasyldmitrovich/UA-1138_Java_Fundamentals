package com.softserve.edu06.hw.task1;

class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin doesn't fly");
    }
}