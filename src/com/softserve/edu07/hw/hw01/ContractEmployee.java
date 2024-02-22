package com.softserve.edu07.hw.hw01;

public class ContractEmployee extends Employee implements Payment {
    public static final String CONTRACT = "Contract";
    private int federalTaxIdmember;
    private double hourlyRate;
    private double numbersOfHoursWorked;
    private double averageMonthSalary;

    public ContractEmployee(String employeeId, String name, int federalTaxIdmember,
                            double hourlyRate, double numbersOfHoursWorked) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numbersOfHoursWorked = numbersOfHoursWorked;
        calculatePay();
    }

    @Override
    public double averageSalary() {
        return averageMonthSalary;
    }

    @Override
    public double calculatePay() {
        averageMonthSalary = hourlyRate * numbersOfHoursWorked;
        return averageMonthSalary;
    }

    @Override
    public String toString() {
        return "Employee " + CONTRACT + '{' +
                "employeeId='" + super.employeeId + '\'' +
                ", name='" + super.name + '\'' +
                ", federal tax id member='" + federalTaxIdmember + '\'' +
                ", Average month salary='" + averageMonthSalary + '\'' +
                '}';
    }
}
