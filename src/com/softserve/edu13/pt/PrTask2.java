package com.softserve.edu13.pt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrTask2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Bob", "Alice", "John"));
        System.out.println(names);
        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);
    }
}
