package com.softserve.edu03.pt;

public class Employee {
    public static final double BONUS_RATE = 0.1;
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return getRate() * getHours();
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
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public static double getTotalSum() {
        return (1+BONUS_RATE) * totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", rate=" + rate + ", hours=" + hours + '}';
    }
}
