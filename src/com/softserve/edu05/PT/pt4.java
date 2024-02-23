package com.softserve.edu05.PT;

import java.util.Scanner;

public class pt4 {
    public static void main(String... args) {
        Scanner SCANNER = new Scanner(System.in);
        Employee[] employees = {
                new Employee("Bob", 1, 2000),
                new Employee("Alex", 2, 4000),
                new Employee("John", 3, 6000),
                new Employee("Kate", 1, 8000),
        };
        System.out.println("Enter department ");
        int departmentNumber = SCANNER.nextInt();

        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartment() == departmentNumber) {
                found = true;
                System.out.println(employee);

            }
            if (!found) {
                System.out.println("Department not found");
            }


        }
        System.out.println("+".repeat(30));

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
}

class Employee {//Move to file Employee.java
    private String name;
    private int department;
    private double salary;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
