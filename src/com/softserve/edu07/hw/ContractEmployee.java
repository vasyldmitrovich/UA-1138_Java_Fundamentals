package com.softserve.edu07.hw;

class ContractEmployee extends Employee implements Payment {//Implements Payment in class Employee
    private double hourlyRate;
    private int numberOfHoursWorked;
    private String federalTaxId;

    ContractEmployee(String employeeld, double hourlyRate, int numberOfHoursWorked, String federalTaxId) {
        super(employeeld);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.federalTaxId = federalTaxId;
    }

    public String getEmployeeId() {//Override this method do not have a sense, because you can use this method by default from parent class
        return getEmployeeld();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
