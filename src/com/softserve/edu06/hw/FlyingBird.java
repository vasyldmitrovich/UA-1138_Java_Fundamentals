package com.softserve.edu06.hw;

public class FlyingBird extends Bird {//Good
    public FlyingBird(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can fly");
    }
}
