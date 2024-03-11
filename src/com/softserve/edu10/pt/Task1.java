package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Vitalii");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Jack");
        employeeMap.put(4, "Alice");
        employeeMap.put(5, "Vitalii");
        employeeMap.put(6, "Martin");
        employeeMap.put(7, "Din");
        System.out.println(employeeMap);

        Scanner scanner = new Scanner(in);
        System.out.println("Enter ID to find");
        int id = scanner.nextInt();
        if(employeeMap.containsKey(id)) {
            System.out.println("Employee with " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with ID " + id);
        }

        scanner.nextLine();

        System.out.println();
        System.out.println("Enter the name to search: ");
        String name = scanner.nextLine().trim();
        if(employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if(entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
        }
    }
}
