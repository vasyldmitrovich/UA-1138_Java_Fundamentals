package com.softserve.edu06.hw.Task1;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.name = "Penguin";
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + this.isFeathers() +
                ", layEggs=" + this.isLayEggs() +
                '}';
    }
}
