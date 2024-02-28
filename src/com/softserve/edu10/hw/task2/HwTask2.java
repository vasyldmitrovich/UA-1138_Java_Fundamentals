package com.softserve.edu10.hw.task2;

import java.util.*;

public class HwTask2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        populate(personMap);
        printMap(personMap);

        boolean hasDuplicates = checkForDuplicates(personMap);
        if (hasDuplicates) {
            System.out.println("There are at least two persons with the same first name.");
        } else {
            System.out.println("There is no two persons with the same first name.");
        }

        System.out.println("After removing: ");
        String removeName = "Orest";
        remove(personMap, removeName);
        printMap(personMap);
    }

    private static void printMap(Map<String, String> personMap) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void populate(Map<String, String> personMap) {
        personMap.put("Ivanov", "Ivan");
        personMap.put("Andriiv", "Orest");
        personMap.put("Shevchenko", "Orest");
        personMap.put("Matviiv", "Alex");
        personMap.put("Petrov", "Bob");
        personMap.put("Erikov", "John");
        personMap.put("Ivanova", "Alice");
        personMap.put("Rodnikova", "Ann");
        personMap.put("Nesterenko", "Mary");
        personMap.put("Petrenko", "Kate");
    }

    private static boolean checkForDuplicates(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        Iterator<String> iterator = personMap.values().iterator();
        while (iterator.hasNext()) {
            String firstName = iterator.next();
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        for (int count : firstNameCount.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }

    public static void remove(Map<String, String> personMap, String removeName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(removeName)) {
                iterator.remove();
            }
        }
    }
}
