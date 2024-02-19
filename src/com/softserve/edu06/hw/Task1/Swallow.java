package com.softserve.edu06.hw.Task1;

public class Swallow extends FlyingBird{

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.name = "Swallow";
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + this.isFeathers() +
                ", layEggs=" + this.isLayEggs() +
                '}';
    }
}
