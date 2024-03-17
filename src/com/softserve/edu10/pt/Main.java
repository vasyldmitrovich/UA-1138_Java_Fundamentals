package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Mike");
        employeeMap.put(102, "Luke");
        employeeMap.put(103, "Marry");
        employeeMap.put(104, "Bob");
        employeeMap.put(105, "Lucy");
        employeeMap.put(106, "Jess");
        employeeMap.put(107, "Robin");

        System.out.println("Information of employeeMap: ");
        for (HashMap.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(" ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an ID to find the name: ");
        int idToFind = scanner.nextInt();

        if (employeeMap.containsKey(idToFind)) {
            System.out.println("Name corresponding to ID " + idToFind + ": " + employeeMap.get(idToFind));
        } else {
            System.out.println("ID " + idToFind + " not found");
        }

        scanner.nextLine();
        System.out.println("\nEnter a name to find the ID: ");
        String nameToFind = scanner.nextLine();

        if (employeeMap.containsValue(nameToFind)) {
            for (HashMap.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(nameToFind)) {
                    System.out.println("ID corresponding to name " + nameToFind + ": " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name \"" + nameToFind + "\" not found");
        }
    }
}
