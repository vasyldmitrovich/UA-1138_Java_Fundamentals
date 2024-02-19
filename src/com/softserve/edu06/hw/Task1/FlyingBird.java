package com.softserve.edu06.hw.Task1;

public abstract class FlyingBird extends Bird{//Ok


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    String fly() {
        return "I can fly!";
    }
}
