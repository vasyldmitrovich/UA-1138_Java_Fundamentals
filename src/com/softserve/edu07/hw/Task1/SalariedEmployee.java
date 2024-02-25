package com.softserve.edu07.hw.Task1;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double numberWorkedHours;
    private double hourlyRate;

    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double numberWorkedHours, double hourlyRate) {
        super(name);
        this.numberWorkedHours = numberWorkedHours;
        this.hourlyRate = hourlyRate;
        socialSecurityNumber = getSocialSecurityNumber();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberWorkedHours;
    }

    public String getSocialSecurityNumber() {
        return "#" + getEmployeeId();
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getNumberWorkedHours() {
        return numberWorkedHours;
    }

    public void setNumberWorkedHours(double numberWorkedHours) {
        this.numberWorkedHours = numberWorkedHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
