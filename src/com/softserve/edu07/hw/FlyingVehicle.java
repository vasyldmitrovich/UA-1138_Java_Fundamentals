package com.softserve.edu07.hw;

abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract public void fly();

    abstract public void land();
}
