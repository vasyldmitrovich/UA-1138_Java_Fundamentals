package com.softserve.edu06.hw.Task1;

public class Eagle extends FlyingBird{


    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.name = "Eagle";
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + this.isFeathers() +
                ", layEggs=" + this.isLayEggs() +
                '}';
    }
}
