package com.softserve.edu06.hw.Task1;

abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    //this method is similar to getters bun not getters (use getters)
    public boolean hasFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }
}