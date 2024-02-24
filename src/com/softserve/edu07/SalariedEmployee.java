package com.softserve.edu07;

public class SalariedEmployee extends Employee {

    private double fixedMonthlyPayment;

    private int socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double fixedMonthlyPayment, int socialSecurityNumber) {
        setEmployeeId(employeeId);
        setName(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
