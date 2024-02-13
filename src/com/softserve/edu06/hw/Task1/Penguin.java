package com.softserve.edu06.hw.Task1;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        this.feathers = false;
        this.layEggs = true;
        this.name = "Penguin";
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
