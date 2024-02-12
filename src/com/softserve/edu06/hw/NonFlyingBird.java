package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(int feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("This bird can not fly");
    }
}
