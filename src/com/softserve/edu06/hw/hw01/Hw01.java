package com.softserve.edu06.hw.hw01;

public class Hw01 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(" has feathers", true, "Eagle"),
                new Swallow(" has feathers", true, "Swallow"),
                new Penguin(" has not feathers", true, "Penguin"),
                new Kiwi(" has feathers", true, "Kiwi")
        };

        for (var bird : birds) {
            System.out.println(bird.getName() + bird.fly());
        }
        for (var bird : birds) {
            System.out.println(bird);
        }
    }
}

