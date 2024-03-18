package com.softserve.edu10.hw.hw01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hw01 {
    public static void main(String[] args) {
        Set set1 = new HashSet<>(List.of("Bob", "Alice", "Jack", "Kate"));
        Set set2 = new HashSet<>(List.of("Bob", "Alice", "Fooo", "Rob"));

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    private static Set union(Set set1, Set set2) {
        for (var item : set1) {
            if (set2.contains(item)) {
                set2.remove(item);
            }
        }
        set1.addAll(set2);
        return set1;
    }

    private static Set intersect(Set set1, Set set2) {
        Set intersectSet = new HashSet();
        for (var item : set1) {
            if (set2.contains(item)) {
                intersectSet.add(item);
            }
        }
        return intersectSet;
    }


}
