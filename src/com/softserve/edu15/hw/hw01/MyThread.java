package com.softserve.edu15.hw.hw01;

public class MyThread extends Thread {
    private String phrase;
    private int pause;

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
