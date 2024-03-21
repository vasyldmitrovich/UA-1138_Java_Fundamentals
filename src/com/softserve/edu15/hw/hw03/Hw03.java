package com.softserve.edu15.hw.hw03;

public class Hw03 {
    public static void main(String[] args) {
        var threadOne = new Thread(() -> {
            System.out.println("Thread number one");
            var threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    try {
                        System.out.println("Thread number two");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                var threadThree = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        try {
                            System.out.println("Thread number three");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                threadThree.start();
            });
            threadTwo.start();
        });
        threadOne.start();
    }
}
