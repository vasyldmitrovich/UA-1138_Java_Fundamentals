package com.softserve.edu07.hw.HW01;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double workedHours;
    double hourlyRate;
    double hourlyPaid;


    public SalariedEmployee(String employeeID, String socialSecurityNumber, double workedHours, double hourlyRate) {
        super(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
        this.hourlyPaid = workedHours * hourlyRate;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyPaid=" + hourlyPaid +
                ", workedHours=" + workedHours +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

    @Override
    public double calculatePay() {
        return hourlyPaid;
    }
}
