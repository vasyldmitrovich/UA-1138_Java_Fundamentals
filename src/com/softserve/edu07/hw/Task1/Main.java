package com.softserve.edu07.hw.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {//ok
    public static void main(String[] args) {
        Payment[] employees = {
                new SalariedEmployee("John", "SSN001", 5000),
                new ContractEmployee("Alice", "FTI002", 20, 160),
                new SalariedEmployee("Bob", "SSN003", 6000),
                new ContractEmployee("Emily", "FTI004", 25, 140)
        };

        Arrays.sort(employees, Comparator.comparingDouble(employee -> -employee.calculatePay()));

        System.out.println("Sorted Employees:");
        for (Payment employee : employees) {
            System.out.println("Employee Name: " + ((Employee) employee).getEmployeeName() + ", Average Monthly Wage: $" + employee.calculatePay());
        }
    }
}