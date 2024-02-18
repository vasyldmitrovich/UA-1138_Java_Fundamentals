package com.softserve.edu06;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }
}


