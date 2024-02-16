package com.softserve.edu06.hw;

public class Hw1 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println(bird.getName() + ":");
            bird.fly();
            System.out.println("Feathers: " + bird.getFeathers());
            System.out.println("Lays Eggs: " + bird.isLayEggs());
            System.out.println();
        }
    }
}

abstract class Bird {//Divide to separate files, not in one file
    protected boolean feathers;//Make private
    protected boolean layEggs;

    protected String name;

    public Bird(boolean feathers, boolean layEggs, String name) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.name = name;
    }

    public abstract void fly();//After getters and setters

    public boolean getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public String getName() {
        return name;
    }
}

class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs, String name) {
        super(feathers, layEggs, name);
    }

    public void fly() {
        System.out.println("This bird can fly");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs, String name) {
        super(feathers, layEggs, name);
    }

    public void fly() {
        System.out.println("This bird can not fly");
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true, "Eagle");
    }
}

class Swallow extends FlyingBird {
    public Swallow () {
        super(true, true, "Swallow");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super(true, true, "Penguin");
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(false, true, "Kiwi");
    }
}

