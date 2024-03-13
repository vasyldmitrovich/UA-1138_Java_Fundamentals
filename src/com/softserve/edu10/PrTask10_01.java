package com.softserve.edu10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrTask10_01 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Alex");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Jack");
        employeeMap.put(5, "John");
        employeeMap.put(6, "Bob");
        employeeMap.put(7, "Alex");
        System.out.println(employeeMap);

        var scan = new Scanner(System.in);
        System.out.println("Enter id to find: ");
        int id = Integer.parseInt(scan.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is "
                    + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id = " + id);
        }

        System.out.println("Enter the name to search: ");
        String name = scan.nextLine().trim();
        boolean found = false;
        for (var entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey() + " : " + name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no employee with name = " + name);
        }
    }
}
