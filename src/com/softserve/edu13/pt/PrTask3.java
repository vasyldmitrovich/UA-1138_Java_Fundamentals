package com.softserve.edu13.pt;

import java.util.function.Predicate;

public class PrTask3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("# > 3:" + count(nums, n -> n > 3));
        System.out.println("# < 8" + count(nums, n -> n < 8));
        System.out.println("# even:" + count(nums, n -> n % 2 == 0));
        System.out.println("# odd:" + count(nums, n -> n % 2 != 0));
    }

    static int count(int[] arr, Predicate<Integer> condition) {
        int res = 0;
        for (var el : arr) {
            if (condition.test(el)) res++;
        }
        return res;
    }
}
