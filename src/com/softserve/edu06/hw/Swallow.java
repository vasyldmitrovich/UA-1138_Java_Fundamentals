package com.softserve.edu06.hw;

public class Swallow extends FlyingBird {
    public Swallow(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
