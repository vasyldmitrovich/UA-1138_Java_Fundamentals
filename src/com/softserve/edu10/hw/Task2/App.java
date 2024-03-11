package com.softserve.edu10.hw.Task2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("McConaughey", "Matthew1");
        personMap.put("Hathaway", "Matthew");
        personMap.put("Chastain", "Jessica");
        personMap.put("Foy", "Mackenzie");
        personMap.put("Burstyn", "Ellen");
        personMap.put("Irwin", "Bill");
        personMap.put("Caine", "Michael");
        personMap.put("Lithgow", "John");
        personMap.put("Gyasi", "David");
        personMap.put("Bentley", "Wes");

        // Check for the same first name
        checkDoubles(personMap);
        System.out.println(personMap);

        // Remove object with some name
        String name = "Matthew";
        Map<String, String> newPersonMap = removePerson(personMap, name);
        System.out.println(newPersonMap);
    }

    public static boolean checkDoubles(Map<String, String> map) {
        Set<String> setOfFirstNames = new HashSet<>(map.values());
        return map.size() > setOfFirstNames.size();
    }

    public static Map<String, String> removePerson(Map<String, String> map, String name) {
        Map<String, String> mapCopy = new HashMap<>(map);

        Iterator<Map.Entry<String, String>> mapIterator = mapCopy.entrySet().iterator();
        Map.Entry<String, String> entry = mapIterator.next();
        while (mapIterator.hasNext()) {
            if(entry.getValue().equals(name)) {
                mapIterator.remove();
                break;
            }
        }
        return mapCopy;
    }
}
