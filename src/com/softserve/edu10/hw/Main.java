package com.softserve.edu10.hw;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "Max");
        personMap.put("Johnson", "Luke");
        personMap.put("Brown", "Sugar");
        personMap.put("White", "Milk");
        personMap.put("Black", "Coffee");
        personMap.put("Read", "Lips");
        personMap.put("Blue", "Shirt");
        personMap.put("Wilson", "Marry");
        personMap.put("Miller", "Orest");
        personMap.put("More", "Orest");

        System.out.println("List of the personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        boolean hasDuplicateFirstName = false;
        HashMap<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
            if (firstNameCount.get(firstName) >= 2) {
                hasDuplicateFirstName = true;
                break;
            }
        }
        personMap.entrySet().removeIf(stringStringEntry -> stringStringEntry.getValue().equals("Orest"));

        System.out.println("/nMap after removing duplicated first name 'Orest'");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
