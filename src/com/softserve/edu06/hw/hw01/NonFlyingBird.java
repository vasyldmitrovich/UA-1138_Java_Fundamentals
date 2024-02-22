package com.softserve.edu06.hw.hw01;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs, String name) {
        super(feathers, layEggs, name);
    }

    @Override
    String fly() {
        return " can not fly ";
    }
}
