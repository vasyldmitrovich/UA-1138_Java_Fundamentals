package com.softserve.edu10.HW.hw01;

import java.util.HashSet;

public class Set {

    public static <T> java.util.Set<T> union(java.util.Set<T> set1, java.util.Set<T> set2) {
        java.util.Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> java.util.Set<T> intersect(java.util.Set<T> set1, java.util.Set<T> set2) {
        java.util.Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}
