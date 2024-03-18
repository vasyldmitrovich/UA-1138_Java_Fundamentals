package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeTask01 {
    public static void main(String[] args) {
        Set set1 = new HashSet<>(List.of("Jake", "Bob", "Marty", "Alice"));
        Set set2 = new HashSet<>(List.of("Jacobs", "Mike", "Alice", "Helen"));

        System.out.println(intersect(set1, set2));
        System.out.println(union(set1, set2));

    }

    private static Set union(Set set1, Set set2) {//Good
        for (var item : set1) {
            if (set2.contains(item)) {
                set2.remove(item);
            }
        }
        set1.addAll(set2);
        return set1;
    }

    private static Set intersect(Set set1, Set set2) {//Ok
        Set intersectSet = new HashSet();
        for (var item : set1) {
            if (set2.contains(item)) {
                intersectSet.add(item);
            }
        }
        return intersectSet;
    }
}