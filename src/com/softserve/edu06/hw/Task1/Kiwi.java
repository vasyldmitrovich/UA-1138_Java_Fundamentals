package com.softserve.edu06.hw.Task1;

public class Kiwi extends NonFlyingBird{


    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
        this.name = "Kiwi";
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + this.isFeathers() +
                ", layEggs=" + this.isLayEggs() +
                '}';
    }
}
