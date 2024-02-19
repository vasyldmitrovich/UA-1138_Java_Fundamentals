package com.softserve.edu07.hw.Task1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Bob", 160, 28),
                new ContractEmployee("Jack", 4029),
                new SalariedEmployee("Alice", 144, 24),
                new ContractEmployee("Alex", 3500)
        };


        Employee[] sortedEmployees = employees.clone();
        Arrays.sort(sortedEmployees, Comparator.comparing(Employee::getEmployeeId).reversed());

        for (Employee employee:
                sortedEmployees) {
            System.out.println(
                    "Employee ID: " + employee.getEmployeeId() + ". " +
                    "Eame: "  + employee.getName() + ". " +
                    "The average monthly wage: " + employee.calculatePay());
        }



    }
}
