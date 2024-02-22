package com.softserve.edu05.pt.pt04;

import java.util.Scanner;

public class Pt04 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee.input(employee1);

        Employee employee2 = new Employee();
        Employee.input(employee2);

        Employee employee3 = new Employee();
        Employee.input(employee3);

        Employee employee4 = new Employee();
        Employee.input(employee4);

        Employee employee5 = new Employee();
        Employee.input(employee5);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        outputEmployeesDepartment(employees);
        System.out.println("=====================================");
        sort(employees);

    }

    public static void outputEmployeesDepartment(Employee[] employees) {
        System.out.println("Enter department number: ");
        int departmentNum = SCANNER.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNum) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees from department #" + departmentNum);
        }
    }

    public static void sort(Employee[] employees) {
        System.out.println("Salary in descending order");
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
        for (var emploee : employees) {
            System.out.println(emploee);
        }
    }
}
