package com.softserve.edu06.hw.Task1;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean hasFeathers() {
        return getFeathers();
    }

    public boolean laysEggs() {
        return getLayEggs();
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }
}