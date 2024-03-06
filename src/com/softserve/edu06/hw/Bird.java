package com.softserve.edu06.hw;

abstract class Bird {
    public String feathers;//Make private and add getters and setters
    public boolean layEggs;

    public abstract void fly();
}

abstract class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Those birds can fly");
    }
}

abstract class NonFlyingBird extends Bird {
    public void fly() {
        System.out.println("Those birds can\'t fly");
    }

    class Eagle extends FlyingBird {
        public Eagle() {
            this.feathers = "Brown";
            this.layEggs = true;
        }
    }

    class Swallow extends FlyingBird {
        public Swallow() {
            this.feathers = "Blue";
            this.layEggs = true;
        }
    }

    class Penguin extends NonFlyingBird {
        public Penguin() {
            this.feathers = "Black and White";
            this.layEggs = true;
        }
    }

    class Kiwi extends NonFlyingBird {
        public Kiwi() {
            this.feathers = "Brown";
            this.layEggs = true;
        }
    }

    public void main(String[] args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Kiwi()};

        for (Bird bird : birds) {
            System.out.println("Bird Type: " + bird.getClass().getSimpleName());
            System.out.println("Feathers: " + bird.feathers);
            System.out.println("Can Lay Eggs: " + bird.layEggs);
            bird.fly();
            System.out.println();
        }
    }
}