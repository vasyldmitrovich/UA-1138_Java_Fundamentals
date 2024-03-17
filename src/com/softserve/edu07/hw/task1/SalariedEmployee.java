package com.softserve.edu07.hw.task1;

class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    int salary;
    int hourlyRate;
    int numberOfHoursWorked;

    SalariedEmployee(String employeeld, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return salary = hourlyRate * numberOfHoursWorked;
    }
}
