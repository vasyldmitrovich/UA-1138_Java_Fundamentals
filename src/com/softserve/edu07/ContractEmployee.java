package com.softserve.edu07;

public class ContractEmployee extends Employee {

    private double hourlyRate;
    private double numberOfHours;
    private int federalITaxIdMember;

    public ContractEmployee(String employeeId, String name, double hourlyRate,
                            double numberOfHours, int federalITaxIdMember) {
        setEmployeeId(employeeId);
        setName(name);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.federalITaxIdMember = federalITaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHours;
    }
}
