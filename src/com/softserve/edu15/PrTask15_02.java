package com.softserve.edu15;

public class PrTask15_02 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new MyThread("Hello, World!", 2000);
        var t2 = new MyThread("Peace in the world", 3000);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Anja");
    }
}

class MyThread extends Thread {
    String phrase;
    int pause;

    public MyThread(String phrase, int pause) {
        this.phrase = phrase;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(phrase);
        }
    }
}
