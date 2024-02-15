package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    private int averageMonthlySalary;

    SalariedEmployee(String employeeId, String name, int socialSecurityNumber, int averageMonthlySalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public int calculatePay() {
        return averageMonthlySalary;
    }

    @Override
    public int calculateAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + super.employeeId + '\'' +
                ", name='" + super.name + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", averageMonthlySalary=" + averageMonthlySalary +
                '}';
    }
}
