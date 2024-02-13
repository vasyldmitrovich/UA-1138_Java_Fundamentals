package com.softserve.edu06.hw.Task1;

public class Kiwi extends NonFlyingBird{

    public Kiwi() {
        this.feathers = true;
        this.layEggs = true;
        this.name = "Kiwi";
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
