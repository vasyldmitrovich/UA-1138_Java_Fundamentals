package com.softserve.edu13.pt;

import java.util.function.IntPredicate;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Count of numbers divisible by 3: " + countNumbers(nums, n -> n % 3 == 0));
        System.out.println("Count of numbers >= 7: " + countNumbers(nums, n -> n >= 7));
        System.out.println("Count of numbers < 5: " + countNumbers(nums, n -> n < 5));
        System.out.println("Count of numbers = 5: " + countNumbers(nums, n -> n == 5));
    }

    static int countNumbers(int[] numbers, IntPredicate condition) {
        int count = 0;
        for (int num : numbers) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}
