package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeName, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}