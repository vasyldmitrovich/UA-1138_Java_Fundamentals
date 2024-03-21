package com.softserve.edu15.hw.hw02;

public class Hw02 {
    public synchronized static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        var thread = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                main(null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        thread.join();
    }
}
