package com.softserve.edu06.hw.hw01;

public class HW01 {
    public static void main(String... args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Penguin(false, true),
                new Kiwi(true, true),
                new Swallow(true, true),
        };

        for (var bird : birds) {
            bird.fly();
        }

    }
}

abstract class Bird {//Move to file Bird.java
    private boolean feather;
    private boolean layEggs;

    public Bird(boolean feather, boolean layEggs) {
        this.feather = feather;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    abstract void fly();
}









