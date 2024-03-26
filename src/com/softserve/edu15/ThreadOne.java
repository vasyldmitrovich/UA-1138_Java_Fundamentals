package com.softserve.edu15;

public class ThreadOne extends Thread {
    String resourceOne;
    String resourceTwo;

    public ThreadOne(String resourceOne, String resourceTwo) {
        this.resourceOne = resourceOne;
        this.resourceTwo = resourceTwo;
    }

    public void run() {
        synchronized (resourceOne) {
            System.out.println("Thread 1: locked " + resourceOne);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            synchronized (resourceTwo) {
                System.out.println("Thread 1: locked " + resourceTwo);
            }
        }
    }
}
