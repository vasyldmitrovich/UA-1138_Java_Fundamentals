package com.softserve.edu06.hw.Task1;

class Swallow extends FlyingBird {
    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is darting through the air.");
    }
}