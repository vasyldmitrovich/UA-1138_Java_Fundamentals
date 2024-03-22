package com.softserve.edu10;

import java.util.HashSet;
import java.util.Set;

public class HW10_1 {

    public static void main(String[] args) {
        Set<String> set1 = Set.of("John", "Mark", "Erik", "Dirk");
        Set<String> set2 = Set.of("John", "Mark", "Mike", "Max");

        Set<String> union = union(set1, set2);
        System.out.println(union);

        Set<String> intersect = intersect(set1, set2);
        System.out.println(intersect);
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
