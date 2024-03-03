package com.softserve.edu07.hw.Task2;

abstract class FlyingVehicle extends Passengers implements Vehicle {

    public void fly() {
        System.out.println("This flying vehicle is flying.");
    }

    public void land() {
        System.out.println("This flying vehicle is landing.");
    }
}