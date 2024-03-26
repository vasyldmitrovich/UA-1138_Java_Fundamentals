package com.softserve.edu15;

public class HW15_03 {

    public static void main(String[] args) throws InterruptedException {
        var t3 = new ThreadRunsThread("Thread number three", 1000, 5, null);
        var t2 = new ThreadRunsThread("Thread number two", 1000, 3, t3);
        var t1 = new ThreadRunsThread("", 500, 0, t2);
        t1.start();
        t1.join();
        System.out.println("My name is Anja");
    }
}
