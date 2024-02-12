package com.softserve.edu06.hw;

public class HomeTask01 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(50, 2),
                new Swallow(100, 8),
                new Penguin(5, 16),
                new Kiwi(60, 6),
        };
        for (var bird : birds) {
            System.out.println(bird.toString());
            bird.fly();
        }
    }
}
