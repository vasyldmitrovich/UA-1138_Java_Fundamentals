package com.softserve.edu06.hw.Task1;

public class Eagle extends FlyingBird{

    public Eagle() {
        this.feathers = true;
        this.layEggs = true;
        this.name = "Eagle";
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
