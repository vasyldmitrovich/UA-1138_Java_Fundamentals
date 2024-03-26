package com.softserve.edu15;

public class ThreadTwo extends Thread {
    String resourceOne;
    String resourceTwo;

    public ThreadTwo(String resourceOne, String resourceTwo) {
        this.resourceOne = resourceOne;
        this.resourceTwo = resourceTwo;
    }

    public void run() {
        synchronized (resourceTwo) {
            System.out.println("Thread 2: locked " + resourceTwo);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            synchronized (resourceOne) {
                System.out.println("Thread 2: locked " + resourceOne);
            }
        }
    }
}
