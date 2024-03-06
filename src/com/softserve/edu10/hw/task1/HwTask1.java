package com.softserve.edu10.hw.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HwTask1 {//Nice
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("First", "Second"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Third", "First"));

        Set<String> unionSet = union(set1, set2);
        System.out.println(unionSet);
        Set<String> intersectedSet = intersect(set1, set2);
        System.out.println(intersectedSet);
    }

    public static Set union(Set set1, Set set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    //перетин
    public static Set intersect(Set set1, Set set2) {
        Set<String> intersectedSet = new HashSet<>(set1);
        intersectedSet.retainAll(set2);
        return intersectedSet;
    }
}
