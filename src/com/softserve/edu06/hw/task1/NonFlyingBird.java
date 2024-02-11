package com.softserve.edu06.hw.task1;

class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }


    @Override
    void fly() {
        //System.out.println("Not fly");
    }
}
