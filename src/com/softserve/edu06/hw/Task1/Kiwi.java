package com.softserve.edu06.hw.Task1;

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi cannot fly due to its heavy body and small wings.");
    }
}