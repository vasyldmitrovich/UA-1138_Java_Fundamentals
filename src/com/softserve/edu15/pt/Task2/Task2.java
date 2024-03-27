package com.softserve.edu15.pt.Task2;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello", 2000);
        var t2 = new MyThread("Peace in the peace", 3000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Illia");
    }
}