package com.softserve.edu06.hw.Task1;

public class App {
    public static void main(String[] args) {
        Bird [] birds = {
                new Eagle(),
                new Kiwi(),
                new Penguin(),
                new Swallow(),
        };

        for (Bird bird : birds) {
            bird.printInformation();
        }
    }
}
