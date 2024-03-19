package com.softserve.edu15.hw;

class NumberOneThread extends Thread {
    public void run() {
        NumberTwoThread threadTwo = new NumberTwoThread();
        threadTwo.start();
    }
}

class NumberTwoThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
        NumberThreeThread threadThree = new NumberThreeThread();
        threadThree.start();
    }
}

class NumberThreeThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}

public class Hw2 {
    public static void main(String[] args) {
        NumberOneThread threadOne = new NumberOneThread();
        threadOne.start();
    }
}
