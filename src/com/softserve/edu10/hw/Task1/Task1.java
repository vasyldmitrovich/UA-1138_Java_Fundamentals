package com.softserve.edu10.hw.Task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("First");
        set1.add("Second");

        Set<String> set2 = new HashSet<>();
        set2.add("Third");
        set2.add("First");

        Set<String> unionSet = union(set1, set2);
        System.out.println("Union of sets: " + unionSet);

        Set<String> intersectedSet = intersect(set1, set2);
        System.out.println("Intersection of sets: " + intersectedSet);
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2) {
        Set<String> intersectedSet = new HashSet<>(set1);
        intersectedSet.retainAll(set2);
        return intersectedSet;
    }
}
