package com.softserve.edu05.pt;

import java.util.Scanner;


public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department number: ");
        Employee[] employees = {
                new Employee("Alice", 1, 10000),
                new Employee("Bob", 2, 9000),
                new Employee("Jack", 2, 12000),
                new Employee("John", 3, 16000),
                new Employee("Marc", 3, 15000),
        };

        int departmentNumber;
        boolean found = false;
        departmentNumber = scanner.nextInt();
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from department " + departmentNumber);
        }

        System.out.println("=".repeat(40));
        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }
    }

    static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
