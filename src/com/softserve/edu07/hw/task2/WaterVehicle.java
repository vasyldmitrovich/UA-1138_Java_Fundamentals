package com.softserve.edu07.hw.task2;

abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public abstract void isSailing();
}
