package com.softserve.edu07.hw.Task1;

public class ContractEmployee extends Employee{
    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String name) {
        super(name);
    }

    public ContractEmployee(String name, double fixedMonthlyPayment) {
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        federalTaxIdMember = getFederalTaxIdMember();
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return "#" + getEmployeeId();
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
}
