package com.softserve.edu15.pt;

public class MyThread extends Thread {
    protected String message;
    protected int pause;

    public MyThread(String message, int pause) {
        this.message = message;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
