package com.softserve.edu06.hw.hw01;

abstract class Bird {
    private String feathers;
    private boolean layEggs;
    private String name;

    protected Bird(String feathers, boolean layEggs, String name) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.name = name;
    }

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public String getName() {
        return name;
    }

    abstract String fly();

    @Override
    public String toString() {
        return "Bird{" +
                " feathers= " + feathers +
                ", layEggs= " + layEggs +
                ", name bird= " + name +
                '}';
    }
}
