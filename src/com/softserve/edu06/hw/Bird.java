package com.softserve.edu06.hw;

abstract class Bird {
    int feathers;//Where is modifier access private?
    int layEggs;

    abstract void fly();//After all methods

    public Bird(int feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    //Add getters and setters

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
