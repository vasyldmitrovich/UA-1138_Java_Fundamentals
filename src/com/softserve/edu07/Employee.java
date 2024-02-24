package com.softserve.edu07;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String employeeId;
    private String name;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee employee) {
        return (int) (employee.calculatePay() - calculatePay());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + getEmployeeId() +
                ", Name=" + getName() +
                ", Average monthly wage=" + calculatePay() +
                '}';
    }
}
