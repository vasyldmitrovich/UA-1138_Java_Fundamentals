package com.softserve.edu06;

public class Kiwi extends NonFlyingBird {

    public Kiwi(boolean feathers, boolean layEggs) {
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
