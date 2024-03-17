package com.softserve.edu07.hw.task1;

class ContractEmployee extends Employee implements Payment {
    String federalTaxIdMember;
    int salary;
    int fixedMonthlyPayment;

    ContractEmployee(String employeeld, String federalTaxIdMember, int fixedMonthlyPayment) {
        super(employeeld);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return salary = fixedMonthlyPayment;
    }
}
