package com.softserve.edu10.hw.Task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("One", "Two", "Three");
        Set<String> set2 = Set.of("Four", "Five", "One");

        union(set1, set2);
        intersect(set1, set2);

        Set<Integer> set3 = Set.of(1,2,3,4);
        Set<Integer> set4 = Set.of(4,5,6,1);

        union(set3, set4);
        intersect(set3, set4);
    }

    public static <T> Set<T> union(Set <T> set1, Set <T> set2) {
        Set<T> uniedSet = new HashSet<>(set1);
        uniedSet.addAll(set2);
        System.out.println(uniedSet);
        return uniedSet;
    }

    public static <T> Set<T> intersect(Set <T> set1, Set <T> set2) {
        Set<T> intersectedSet = new HashSet<>(set1);
        intersectedSet.retainAll(set2);
        System.out.println(intersectedSet);
        return intersectedSet;
    }
}
