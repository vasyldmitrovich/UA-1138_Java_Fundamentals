package com.softserve.edu07.hw;

public class Htask1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("1", "SSN123");
        employees[1] = new ContractEmployee("2", "FEDID456");

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Average Monthly Wage: " + employee.calculateAverageMonthlyWage());
            System.out.println();
        }
    }
}

interface Payment {
    double calculatePay();
}

abstract class Employee {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public abstract double calculateAverageMonthlyWage();
}

class SalariedEmployee extends Employee implements Payment {//Implement interface Payment in Employee class
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return 10000;
    }

    @Override
    public double calculateAverageMonthlyWage() {
        return calculatePay();
    }
}

class ContractEmployee extends Employee implements Payment {
    private String federalTaxId;

    public ContractEmployee(String employeeId, String federalTaxId) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
    }

    @Override
    public double calculatePay() {
        return 20 * 40;
    }

    @Override
    public double calculateAverageMonthlyWage() {
        return calculatePay();
    }
}
