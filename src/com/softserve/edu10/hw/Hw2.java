package com.softserve.edu10.hw;

import java.util.*;

public class Hw2 {//Good
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "Michael");
        personMap.put("Brown", "Emma");
        personMap.put("Jones", "Daniel");
        personMap.put("Garcia", "Sophia");
        personMap.put("Miller", "Matthew");
        personMap.put("Davis", "Emma");
        personMap.put("Rodriguez", "Ethan");
        personMap.put("Martinez", "Orest");
        for (Map.Entry person: personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
        System.out.println("*".repeat(60));

        boolean check = checkFirstName(personMap);
        if (check) {
            System.out.println("There are some people with the same name");
        } else {
            System.out.println("There are no people with the same name");
        }
        System.out.println("*".repeat(60));

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("Orest"));

        for (Map.Entry person: personMap.entrySet()) {
            System.out.println(person.getKey() + " " + person.getValue());
        }
    }

    public static boolean checkFirstName(Map<String, String> map) {
        Set<String> firstNames = new HashSet<>();
        for (String firstName : map.values()) {
            if (!firstNames.add(firstName)) {
                return true;
            }
        }
        return false;
    }
}
