package com.softserve.edu06.hw;

public class Kiwi extends FlyingBird {

    public Kiwi(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
