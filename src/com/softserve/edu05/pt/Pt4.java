package com.softserve.edu05.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class Pt4 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Tom", 2, 12_000),
                new Employee("Bob", 1, 10_000),
                new Employee("John", 3, 11_000),
                new Employee("Jack", 3, 9_000),
                new Employee("Alice", 2, 15_000)
        };

        Scanner scanner = new Scanner(in);
        System.out.println("Enter department number:");
        int departmentNumber = scanner.nextInt();
        boolean found = false;
        for (var employee: employees){
            if (employee.getDepartmentNumber() == departmentNumber){
                System.out.println(employee);
                found = true;
            }
        }
        if (!found){
            System.out.println("There are no employees from " + departmentNumber + " department");
        }
        System.out.println("-".repeat(40));
        sort(employees);
        for (var employee: employees) {
            System.out.println(employee);
        }
    }
    static void sort(Employee[] employees){
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()){
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }
}
class Employee {//Move to file Employee.java
    String name;//Make fields private
    int departmentNumber;
    double salary;

    //Add constructor without parameters
    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", departmentNumber = " + departmentNumber +
                ", salary = " + salary +
                '}';
    }
}
