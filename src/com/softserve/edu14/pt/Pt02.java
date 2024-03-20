package com.softserve.edu14.pt;

import java.util.List;

public class Pt02 {
    public static void main(String[] args) {
        var primes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var stats = primes.stream()
                .mapToInt(i -> i)
                .summaryStatistics();
        System.out.println("min = " + stats.getMin());
        System.out.println("min = " + stats.getMax());
        System.out.println("min = " + stats.getCount());
        System.out.println("min = " + stats.getSum());
    }
}
