package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Pt1 {
    public static void main(String[] args) {//Ok
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Alex");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Jack");
        employeeMap.put(5, "John");
        employeeMap.put(6, "Bob");
        employeeMap.put(7, "Alex");
        System.out.println(employeeMap);

        Scanner scanner = new Scanner(in);
        System.out.println("Enter ID to find:");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with ID = " + id + " is " +
                    employeeMap.get(id));
        } else {
            System.out.println("There is no employee with ID = " + id);
        }

        System.out.println("Enter the name to search for:");
        String name = scanner.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            for (var entry: employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " : " + name);
                }
            }
        } else {
            System.out.println("There is no employee with name = " + name);
        }
    }
}
