package com.softserve.edu05.pt;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Task4 {
    public static void task4(Employee[] employees) {

        // Output results for all employees of a certain department (input department number in the console)
        System.out.print("Enter department number: ");
        Scanner scanner = new Scanner(in);
        int department = scanner.nextInt();
        Task4.findEmployeeByDepartment(employees, department);

        // Output results for arrange workers by the field salary in descending order.
        Task4.sortWorkers(employees);
    }

    public static ArrayList<Employee> findEmployeeByDepartment(Employee[] employees, int department) {
        ArrayList<Employee> employeesWithSameDepartment = new ArrayList<>();
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == department) {
                employeesWithSameDepartment.add(employee);
            }
        }

        System.out.println(employeesWithSameDepartment);
        return employeesWithSameDepartment;
    }

    public static void sortWorkers(Employee[] employees) {
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
