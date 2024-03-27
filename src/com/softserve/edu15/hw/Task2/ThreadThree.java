package com.softserve.edu15.hw.Task2;

public class ThreadThree extends Thread {
    static Object lock3 = new Object();

    public void run() {
        System.out.println("Third thread: Running");
    }
}