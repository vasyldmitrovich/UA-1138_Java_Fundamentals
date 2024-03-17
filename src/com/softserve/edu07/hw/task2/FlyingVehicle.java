package com.softserve.edu07.hw.task2;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public abstract void fly();

    public abstract void land();
}
