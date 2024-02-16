package com.softserve.edu07.hw.task1;

class SalariedEmployee extends Employee implements Payment {//implements Payment in class Employee
    double fixedSalary;//Add modifier access private for fields
    String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double fixedSalary, String socialSecurityNumber) {
        super(employeeId);
        this.fixedSalary = fixedSalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public void calculatePay() {
        System.out.println("The average monthly salary = " + fixedSalary);
    }

    @Override
    public String toString() {
        return "SalariedEmployee {" +
                "EmployeeId=" + getEmployeeId() +
                ", fixedSalary=" + fixedSalary +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}