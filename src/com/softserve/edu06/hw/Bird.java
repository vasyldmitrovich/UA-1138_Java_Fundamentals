package com.softserve.edu06.hw;

abstract class Bird {
    int feathers;
    int layEggs;

    abstract void fly();

    public Bird(int feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
