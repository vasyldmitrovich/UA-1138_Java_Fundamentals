package com.softserve.edu15;

public class HW15_01 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello, World!", 1000);
        var t2 = new MyThread("Peace in the world", 1500);
        var t3 = new MyThread("Third thread message", 500);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Anja");
        t3.start();
        t3.join();
    }
}
