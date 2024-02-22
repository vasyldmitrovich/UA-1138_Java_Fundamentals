package com.softserve.edu07.hw.hw01;

public class SalariedEmployee extends Employee implements Payment {
    public static final String SALARIED = "Salaried";
    private int socialSecurityNumber;
    private int averageMonthSalary;

    public SalariedEmployee(String employeeId, String name, int socialSecurityNumber, int averageMonthSalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.averageMonthSalary = averageMonthSalary;
    }

    @Override
    public double averageSalary() {
        return averageMonthSalary;
    }

    @Override
    public double calculatePay() {
        return averageMonthSalary;
    }

    @Override
    public String toString() {
        return "Employee " + SALARIED + '{' +
                "employeeId='" + super.employeeId + '\'' +
                ", name='" + super.name + '\'' +
                ", Security number='" + socialSecurityNumber + '\'' +
                ", Average month salary='" + averageMonthSalary + '\'' +
                '}';
    }
}
