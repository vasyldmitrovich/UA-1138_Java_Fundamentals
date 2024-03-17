package com.softserve.edu07.hw.task2;

class Helicopter extends FlyingVehicle {
    protected int weight;
    protected int maxHeight;

    Helicopter(int weight, int maxHeight, int passengers) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
