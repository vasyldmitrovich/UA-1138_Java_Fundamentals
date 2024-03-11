package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Pt1 {
    public static void main(String[] args) {
        // Task 1
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println("*".repeat(40));

        // Task 2
        var today = LocalDate.now();
        System.out.println(today.getDayOfWeek());
        var firstMonday = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);
        System.out.println("*".repeat(40));

        // Task 3
        List<String> names = new ArrayList<>(
                List.of("Bob", "Alice", "Tom", "John")
        );
        System.out.println(names);
        names.sort(String :: compareTo);
        System.out.println(names);
        System.out.println("*".repeat(40));

        // Task 4
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("# > 3: " + count(nums, n -> n > 3));
        System.out.println("# < 8: " + count(nums, n -> n < 8));
        System.out.println("# even: " + count(nums, n -> n % 2 == 0));
        System.out.println("# odd: " + count(nums, n -> n % 2 != 0));
    }

    static int count(int[] arr, IntPredicate condition) {
        int res = 0;
        for (var el : arr) {
            if (condition.test(el)) res++;
        }
        return res;
    }
}
