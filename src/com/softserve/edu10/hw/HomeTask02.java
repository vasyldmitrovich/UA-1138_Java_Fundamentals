package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeTask02 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Alice");
        personMap.put("Williams", "Bob");
        personMap.put("Jones", "Charlie");
        personMap.put("Brown", "David");
        personMap.put("Davis", "Fill");
        personMap.put("Miller", "Frank");
        personMap.put("Wilson", "Alice");
        personMap.put("Moore", "Henry");
        personMap.put("Taylor", "Ivy");

        System.out.println(personMap);
        System.out.println("Duplicates: " + checkForDuplicates(personMap));
        System.out.println("Map with removed person: " + removePersonFromMap(personMap, "Bob"));
    }

    private static boolean checkForDuplicates(Map<String, String> map) {
        Map<String, Boolean> firstNameAlreadyAdded = new HashMap<>();
        for (String firstName : map.values()) {
            if (firstNameAlreadyAdded.containsKey(firstName)) {
                return true;
            } else {
                firstNameAlreadyAdded.put(firstName, true);
            }
        }
        return false;
    }

    private static Map<String, String> removePersonFromMap(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }

        return map;
    }

}
