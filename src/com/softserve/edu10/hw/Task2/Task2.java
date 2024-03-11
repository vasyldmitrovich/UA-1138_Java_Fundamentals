package com.softserve.edu10.hw.Task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = createPersonMap();
        displayPersonMap(personMap);

        boolean hasDuplicates = hasDuplicateFirstNames(personMap);
        if (hasDuplicates) {
            System.out.println("There are at least two persons sharing the same first name.");
        } else {
            System.out.println("There are no persons with the same name");
        }

        System.out.println("After removal:");
        removePersonByName(personMap, "Kevin");
        displayPersonMap(personMap);
    }

    public static Map<String, String> createPersonMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Anderson", "John");
        personMap.put("Brown", "Peter");
        personMap.put("Clark", "Kevin");
        personMap.put("Davis", "Sam");
        personMap.put("Evans", "Tom");
        personMap.put("Garcia", "Alex");
        personMap.put("Harris", "Bob");
        personMap.put("Jackson", "Alice");
        personMap.put("Lee", "Ann");
        personMap.put("Martin", "Mary");
        return personMap;
    }

    public static void displayPersonMap(Map<String, String> personMap) {
        System.out.println("Person Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("*".repeat(60));
    }

    public static boolean hasDuplicateFirstNames(Map<String, String> personMap) {
        Set<String> firstNames = new HashSet<>();
        for (String firstName : personMap.values()) {
            if (!firstNames.add(firstName)) {
                return true;
            }
        }
        return false;
    }

    public static void removePersonByName(Map<String, String> personMap, String name) {
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(name));
    }
}

