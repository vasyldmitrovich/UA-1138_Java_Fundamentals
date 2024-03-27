package com.softserve.edu15.hw.Task2;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        ThreadThree threadThree = new ThreadThree();

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        threadThree.start();

        threadThree.join();

        System.out.println("All threads have completed their tasks.");
    }
}
