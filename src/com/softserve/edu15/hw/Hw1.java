package com.softserve.edu15.hw;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            var t1 = new MyThread("Hello, world", 1000);
            var t2 = new MyThread("Peace in the world", 1000);
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            break;
        }
        var t3 = new MyThread("Hello, my name is Yaroslav", 1000);
        t3.start();
        t3.join();
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
                System.out.println(phrase);
            } catch (InterruptedException e) {}
        }
    }
}
