package com.softserve.edu10.pt.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Map<Integer, String> employeeData = new HashMap<>();
        employeeData.put(1, "Emily");
        employeeData.put(2, "Daniel");
        employeeData.put(3, "Sophia");
        employeeData.put(4, "Michael");
        employeeData.put(5, "Emma");
        employeeData.put(6, "Liam");
        employeeData.put(7, "Olivia");
        System.out.println(employeeData);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (employeeData.containsKey(id)) {
            System.out.println("Employee with ID = " + id + " is " + employeeData.get(id));
        } else {
            System.out.println("There is no employee with ID = " + id);
        }

        System.out.println("Enter a name to search: ");
        String name = scanner.nextLine().trim();
        boolean found = false;
        for (var entry : employeeData.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey() + " : " + name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no employee with name = " + name);
        }

        scanner.close();
    }
}
