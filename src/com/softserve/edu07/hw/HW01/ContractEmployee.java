package com.softserve.edu07.hw.HW01;

public class ContractEmployee extends Employee implements Payment {
    int federalTaxIdmember;
    double fixedPaid;

    public ContractEmployee(String employeeID, int federalTaxIdmember, double fixedPaid) {
        super(employeeID);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPaid = fixedPaid;
    }

    @Override
    public double calculatePay() {
        return fixedPaid;
    }
}
