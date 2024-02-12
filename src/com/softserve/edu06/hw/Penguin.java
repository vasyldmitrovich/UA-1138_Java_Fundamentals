package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird {
    public Penguin(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
