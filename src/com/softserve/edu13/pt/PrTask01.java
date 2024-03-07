package com.softserve.edu13.pt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrTask01 {
    public static void main(String[] args) {
        System.out.println(dateNow());
        System.out.println(firstMonday());
        System.out.println(printSortedNames("Bob", "alice", "John"));

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(nums, n -> n > 5));

    }

    public static DayOfWeek dateNow() {
        return LocalDate.now().getDayOfWeek();
    }

    public static LocalDate firstMonday() {
        return LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    }

    public static List<String> printSortedNames(String... names) {
        List<String> nameList = new ArrayList<>(List.of(names));
        nameList.sort(String::compareToIgnoreCase);
        return nameList;
    }

    public static int count(int[] arr, Predicate<Integer> condition) {
        int res = 0;
        for (var el : arr) {
            if (condition.test(el)) {
                res++;
            }
        }
        return res;
    }
}
