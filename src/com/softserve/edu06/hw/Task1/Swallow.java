package com.softserve.edu06.hw.Task1;

public class Swallow extends FlyingBird{
    public Swallow() {
        this.feathers = true;
        this.layEggs = true;
        this.name = "Swallow";
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
