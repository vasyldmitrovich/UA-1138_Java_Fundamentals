package com.softserve.edu05.pt;

import java.util.Scanner;

public class PrTask04 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("ALice", 1, 10_000),
                new Employee("Bob", 2, 14_000),
                new Employee("Jake", 2, 9_000),
                new Employee("John", 3, 12_000),
                new Employee("Kole", 3, 11_000),
        };
        System.out.println("Enter department number: ");
        int departmentNumer = SCANNER.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumer) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from " + departmentNumer + " department.");
        }

        System.out.println("--".repeat(30));
        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }

    }

    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }

            }

        }
    }
}
