package com.softserve.edu15.hw.Task2;

public class ThreadTwo extends Thread {
    static Object lock2 = new Object();

    public void run() {
        synchronized (ThreadThree.lock3) {
            System.out.println("Second thread: Obtained lock3");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ThreadOne.lock1) {
                System.out.println("Second thread: Attempting to acquire lock1 (deadlock potential)");
            }
        }
    }
}

