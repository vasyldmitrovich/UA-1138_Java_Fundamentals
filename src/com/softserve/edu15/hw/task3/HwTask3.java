package com.softserve.edu15.hw.task3;

public class HwTask3 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread number one");

            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });
            two.start();

            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
        });

        one.start();
    }
}
