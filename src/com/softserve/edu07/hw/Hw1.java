package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Hw1 {
    public static void main(String[] args) {
        Payment[] employees = {
                new SalariedEmployee("001", 12.000, "3"),
                new ContractEmployee("002", 120, 25, "01-12-45"),
                new SalariedEmployee("003", 14000, "4"),
                new ContractEmployee("004", 85, 30, "00-12-34")
        };

        Arrays.sort(employees, new EmployeeComparator());

        for (Payment employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() +
                    ", Average Monthly Wage: " + employee.calculatePay());
        }
    }
}

interface Payment {
    double calculatePay();
    String getEmployeeId();
}
