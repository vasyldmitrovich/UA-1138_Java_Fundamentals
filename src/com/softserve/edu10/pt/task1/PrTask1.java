package com.softserve.edu10.pt.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrTask1 {//Ok
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Alice");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "John");
        employeeMap.put(4, "Alex");
        employeeMap.put(5, "Bob");
        employeeMap.put(6, "John");
        employeeMap.put(7, "Kate");
        System.out.println(employeeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id = " + id);
        }
        System.out.println("Enter a name to search: ");
        String name = scanner.nextLine().trim();
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
