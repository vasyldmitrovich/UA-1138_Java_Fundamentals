package com.softserve.edu15.hw.Task1;

class MyThread extends Thread {
    private String message;
    private int delay;

    public MyThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + ": Message " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
