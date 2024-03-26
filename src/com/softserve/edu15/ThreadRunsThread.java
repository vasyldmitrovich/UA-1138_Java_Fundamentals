package com.softserve.edu15;

public class ThreadRunsThread extends Thread {

    String phrase;
    int pause;
    int repeatedTime;
    Thread innerThread;

    public ThreadRunsThread(String phrase, int pause, int repeatedTime, Thread thread) {
        this.phrase = phrase;
        this.pause = pause;
        this.repeatedTime = repeatedTime;
        this.innerThread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeatedTime; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println(phrase);
        }

        if (innerThread != null) {
            innerThread.run();
            try {
                innerThread.join();
            } catch (InterruptedException e) {
            }
        }
    }
}
