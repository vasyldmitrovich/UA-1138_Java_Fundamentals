package com.softserve.edu15.hw.Task3;

public class ThreadTwo {
    public static Thread createThreadTwo() {
        return new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Thread number two");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            Thread threadThree = ThreadThree.createThreadThree();
            threadThree.start();
        });
    }
}
