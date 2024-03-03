package com.softserve.edu06.hw.Task1;

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This non-flying bird cannot fly.");
    }
}