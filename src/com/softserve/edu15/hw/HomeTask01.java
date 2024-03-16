package com.softserve.edu15.hw;

import com.softserve.edu15.pt.MyThread;

public class HomeTask01 {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new MyThread("Thread 1", 100);
        var thread2 = new MyThread("Thread 2", 100);
        var thread3 = new MyThread("Thread 3", 100);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}
