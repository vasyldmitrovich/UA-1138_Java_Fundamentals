package com.softserve.edu07.hw;

class SalariedEmployee extends Employee implements Payment {
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    SalariedEmployee(String employeeld, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeld);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmployeeId() {
        return getEmployeeld();
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
