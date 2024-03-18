package com.softserve.edu10.hw.hw02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Mahir", "Burns");
        personMap.put("Subhan", "Mora");
        personMap.put("Sanaa", "O'Connor");
        personMap.put("Denise", "Cochran");
        personMap.put("Alan", "Meyers");
        personMap.put("Myrtle", "Dixon");
        personMap.put("Arjan", "Rodgers");
        personMap.put("Edgar", "Bowen");
        personMap.put("Gene", "Rice");
        personMap.put("Bob", "Dixon");

        System.out.println(personMap);
        String removeName = input();
        removePerson(personMap, removeName);
        System.out.println(personMap);
        System.out.println(checkDuplicate(personMap));
    }

    private static void removePerson(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(name)) {
                iterator.remove();
            }

        }
    }

    public static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name to remove: ");
        return scanner.nextLine();
    }

    public static boolean checkDuplicate(Map<String, String> map) {
        Map<String, Boolean> name = new HashMap<>();
        for (String alreadyHave : map.values()) {
            if (name.containsKey(alreadyHave)) {
                return true;
            } else {
                name.put(alreadyHave, true);
            }
        }
        return false;
    }
}
