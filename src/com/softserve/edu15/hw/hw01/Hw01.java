package com.softserve.edu15.hw.hw01;

public class Hw01 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello", 100);
        var t2 = new MyThread("World", 200);
        var t3 = new MyThread("Java", 50);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
