package com.softserve.edu03.pt;

public class Employee {
    public static final double BONUS_RATE = 0.1;
    private String name;
    private int rate;
    private int hours;
    private static double totalSum;

    //Add constructor without parameters

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary() + getBonuses();
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * BONUS_RATE;
    }

    //Move this method after getters and setters
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }
}
