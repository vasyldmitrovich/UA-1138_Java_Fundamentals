package com.softserve.edu15.hw;

public class HomeTask02 {
    public synchronized static void main(String[] args) throws InterruptedException {
        System.out.println("Start: ");
        var thread1 = new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                main(null);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread1.join();
    }
}
