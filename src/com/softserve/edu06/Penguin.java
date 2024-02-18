package com.softserve.edu06;

public class Penguin extends NonFlyingBird {

    public Penguin(boolean feathers, boolean layEggs) {
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + ": feathers:" + isFeathers()
                + " layEggs:" + isLayEggs();
    }
}
