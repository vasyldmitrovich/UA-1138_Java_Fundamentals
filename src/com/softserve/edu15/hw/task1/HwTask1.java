package com.softserve.edu15.hw.task1;

public class HwTask1 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThreads("Hello", 1000);
        var t2 = new MyThreads("How are you?", 1200);
        var t3 = new MyThreads("Good luck", 1300);

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
