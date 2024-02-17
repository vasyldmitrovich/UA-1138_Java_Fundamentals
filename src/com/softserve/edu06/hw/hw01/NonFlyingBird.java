package com.softserve.edu06.hw.hw01;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feather, boolean layEggs) {
        super(feather, layEggs);
    }

    void fly() {
        System.out.println("Don't fly");

    }

}
