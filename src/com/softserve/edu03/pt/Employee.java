package com.softserve.edu03.pt;

// Task 2
public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public static void updateTotalSum(Employee employee) {
        totalSum += employee.getSalary();
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours" + hours +
                "}";
    }
}
