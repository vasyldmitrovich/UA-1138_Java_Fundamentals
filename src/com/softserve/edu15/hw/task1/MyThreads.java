package com.softserve.edu15.hw.task1;

public class MyThreads extends Thread {
    String phrase;
    int pause;

    public MyThreads(String phrase, int pause) {
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
