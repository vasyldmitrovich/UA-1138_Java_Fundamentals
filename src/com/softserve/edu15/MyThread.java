package com.softserve.edu15;

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
