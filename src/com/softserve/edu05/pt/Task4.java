package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Emma", 1, 11000),
                new Employee("Charlie", 2, 13000),
                new Employee("Liam", 2, 9500),
                new Employee("Olivia", 3, 11500),
                new Employee("Mia", 3, 10500)
        };

        System.out.println("Enter department number: ");
        int departmentNumber = scanner.nextInt();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from department " + departmentNumber);
        }

        System.out.println("--".repeat(30));
        sortEmployeesBySalary(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static void sortEmployeesBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}

