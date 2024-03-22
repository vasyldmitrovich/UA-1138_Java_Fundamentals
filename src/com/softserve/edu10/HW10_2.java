package com.softserve.edu10;

import java.util.HashMap;
import java.util.Map;

public class HW10_2 {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Snow", "John");
        personMap.put("Lennon", "John");
        personMap.put("Momoa", "Jason");
        personMap.put("Russel", "Kurt");
        personMap.put("Cobain", "Kurt");
        personMap.put("Schrody", "Erik");
        personMap.put("Syla", "Orest");
        personMap.put("Collins", "Phil");
        personMap.put("Bender", "Ostap");
        personMap.put("Lee", "Jet");
        System.out.println(personMap);

        String keyForRemove = null;
        for (String lastName : personMap.keySet()) {
            if (personMap.get(lastName).equals("Orest")) {
                keyForRemove = lastName;
                break;
            }
        }

        if (keyForRemove != null) {
            personMap.remove(keyForRemove);
        }
        System.out.println(personMap);
    }
}
