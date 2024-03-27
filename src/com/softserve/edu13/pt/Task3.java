package com.softserve.edu13.pt;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> animals = List.of("cat", "dog", "fish", "hamster");
        List<String> sortedAnimals = sortList(animals);
        System.out.println("Sorted list: " + sortedAnimals);
    }

    public static List<String> sortList(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}

