package com.softserve.edu15.hw.task2;

public class HwTask2 {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Acquired lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Attempting to acquire lock2 (deadlock occurs here)");
                }
            }
        }).start();

        synchronized (lock2) {
            System.out.println("Main Thread: Acquired lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock1) {
                System.out.println("Main Thread: Attempting to acquire lock1 (deadlock occurs here)");
            }
        }
    }
}
