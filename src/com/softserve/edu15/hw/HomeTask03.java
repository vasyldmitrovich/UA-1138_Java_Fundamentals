package com.softserve.edu15.hw;

public class HomeTask03 {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new Thread(() -> System.out.println("Thread 1 is running"));

        var thread2 = new Thread(() -> {
            try {
                thread1.join();
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread 2 is running");
                }
                var thread3 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 3 is running");
                    }
                });
                thread3.start();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
