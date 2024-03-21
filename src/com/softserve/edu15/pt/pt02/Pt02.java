package com.softserve.edu15.pt.pt02;

public class Pt02 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello world", 2000);
        var t2 = new MyThread("Peace in the world", 3000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Mykyta");
    }
}
