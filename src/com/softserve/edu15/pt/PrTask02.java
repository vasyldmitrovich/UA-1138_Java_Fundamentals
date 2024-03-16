package com.softserve.edu15.pt;

public class PrTask02 {
    public static void main(String[] args) throws InterruptedException {
        var tread1 = new MyThread("Hello, world", 2000);
        var tread2 = new MyThread("Peace in the world", 3000);

        tread1.start();
        tread2.start();
        tread1.join();
        tread2.join();
        System.out.println("My name is Nikita");
    }
}
