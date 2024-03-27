package com.softserve.edu15.hw.Task2;

public class ThreadOne extends Thread {
    static Object lock1 = new Object();

    public void run() {
        synchronized (ThreadTwo.lock2) {
            System.out.println("First thread: Obtained lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ThreadThree.lock3) {
                System.out.println("First thread: Attempting to acquire lock3 (deadlock potential)");
            }
        }
    }
}
