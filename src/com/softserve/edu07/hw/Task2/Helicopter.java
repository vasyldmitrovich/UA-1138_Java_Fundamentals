package com.softserve.edu07.hw.Task2;

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying.");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing.");
    }

    @Override
    public void drive() {
        throw new UnsupportedOperationException("Helicopters cannot drive on roads.");
    }
}