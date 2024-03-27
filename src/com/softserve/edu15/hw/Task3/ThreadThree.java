package com.softserve.edu15.hw.Task3;

public class ThreadThree {
    public static Thread createThreadThree() {
        return new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Thread number three");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

