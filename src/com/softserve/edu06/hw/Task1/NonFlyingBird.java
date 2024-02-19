package com.softserve.edu06.hw.Task1;

public abstract class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    String fly() {
        return "I can`n fly!";
    }
}
