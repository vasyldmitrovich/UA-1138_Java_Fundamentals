package com.softserve.edu06.hw.Task1;

public class App {
    public static void main(String[] args) {
        Bird [] birds = {
                new Eagle(true, true),
                new Kiwi(true,true),
                new Penguin(false, true),
                new Swallow(true,true),
        };

        for (Bird bird : birds) {
            bird.printInformation();
        }
    }
}
