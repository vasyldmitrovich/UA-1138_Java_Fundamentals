package com.softserve.edu13.hw.task3;

public class HwTask3 {
    public static void main(String[] args) {
        int year = 2023;
        System.out.println("Is leap?: " + isLeap(year));
    }

    public static boolean isLeap(int y) {
        if (y % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
