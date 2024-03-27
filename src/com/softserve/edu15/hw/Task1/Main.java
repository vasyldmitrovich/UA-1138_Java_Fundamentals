package com.softserve.edu15.hw.Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("Hello", 1000);
        MyThread t2 = new MyThread("World", 1000);
        MyThread t3 = new MyThread("SoftServe", 1000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }
}
