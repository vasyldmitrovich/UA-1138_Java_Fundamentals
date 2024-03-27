package com.softserve.edu15.hw.Task3;

public class ThreadOne {
    public static Thread createThreadOne() {
        return new Thread(() -> {
            System.out.println("Thread number one");
            Thread threadTwo = ThreadTwo.createThreadTwo();
            threadTwo.start();
        });
    }
}
