package com.softserve.edu06.hw.task1;

class Kiwi extends NonFlyingBird {

    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi doesn't fly");
    }
}