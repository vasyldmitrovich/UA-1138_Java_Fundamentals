package com.softserve.edu07.hw.HW01;

public class Main {
    public static void main(String... args) {
        Employee[] employees = {
                new ContractEmployee("Bob", 12345, 10000),
                new ContractEmployee("John", 67890, 10000),
                new SalariedEmployee("Alica", "123456789", 12, 15.0),
                new SalariedEmployee("Alex", "987654321", 30, 12.0),

        };


        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeID);
            if (employee instanceof SalariedEmployee) {
                System.out.println("Social Security Number: " + ((SalariedEmployee) employee).socialSecurityNumber);
            } else if (employee instanceof ContractEmployee) {
                System.out.println("Federal Tax ID: " + ((ContractEmployee) employee).federalTaxIdmember);
            }
            System.out.println("Average Monthly Salary: " + ((Payment) employee).calculatePay());
        }

    }
}
