package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee implements Payment {//make implements Payment in class Employee
    private String federalTaxId;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeName, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeName);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}