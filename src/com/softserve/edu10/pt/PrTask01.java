package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class PrTask01 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John");
        employeeMap.put(2, "Jack");
        employeeMap.put(3, "Jinny");
        employeeMap.put(4, "Bob");
        employeeMap.put(5, "Bary");
        employeeMap.put(6, "Kate");
        employeeMap.put(7, "Bob");

        System.out.println(employeeMap);

        var scan = new Scanner(in);
        System.out.println("Enter id to find: ");
        int id = Integer.parseInt(scan.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id = " + id);
        }

        System.out.println("Enter the name: ");
        String name = scan.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + " : " + name);
                }
            }
        } else {
            System.out.println("There is no employee with name = " + name);
        }
    }
}
