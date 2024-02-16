package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment {//implements Payment in abstract class Employee
    private int federalTaxIdmember;
    private int hourlyRate;
    private int numberOfHoursWorked;
    private int averageMonthlySalary;

    public ContractEmployee(String employeeId, String name, int federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        calculatePay();
    }

    @Override
    public int calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;
        return averageMonthlySalary;
    }

    @Override
    public int calculateAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + super.employeeId + '\'' +
                ", name='" + super.name + '\'' +
                ", federalTaxIdmember=" + federalTaxIdmember +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", averageMonthlySalary=" + averageMonthlySalary +
                '}';
    }
}
