package com.softserve.edu06.hw.hw01;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs, String name) {
        super(feathers, layEggs, name);
    }

    @Override
    String fly() {
        return " this bird can fly ";
    }

}
