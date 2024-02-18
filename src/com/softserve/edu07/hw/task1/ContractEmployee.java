package com.softserve.edu07.hw.task1;

class ContractEmployee extends Employee implements Payment {//implements Payment in class Employee

    double hoursWorked;//Make fields private and add getters and setters
    double hourlyRate;
    String federalTaxIdmember;


    public ContractEmployee(String employeeId, double hoursWorked, double hourlyRate, String federalTaxIdmember) {
        super(employeeId);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public void calculatePay() {
        System.out.println("The average monthly salary = " + hourlyRate * hoursWorked);
    }

    @Override
    public String toString() {
        return "ContractEmployee {" +
                "EmployeeId=" + getEmployeeId() +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", federalTaxIdmember='" + federalTaxIdmember + '\'' +
                '}';
    }
}