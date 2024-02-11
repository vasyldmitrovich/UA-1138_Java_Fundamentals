package com.softserve.edu06.hw.task1;

import java.util.Arrays;

public class HwTask1 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Penguin(true, true),
                new Eagle(true, true),
                new Swallow(true, true),
                new Kiwi(true, true)
        };
        //System.out.println(Arrays.toString(birds));
        for (var bird : birds) {
            bird.fly();
        }

    }
}












