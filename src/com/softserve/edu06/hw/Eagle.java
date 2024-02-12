package com.softserve.edu06.hw;

public class Eagle extends FlyingBird {

    public Eagle(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
