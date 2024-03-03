package com.softserve.edu06.hw.Task1;

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }
}