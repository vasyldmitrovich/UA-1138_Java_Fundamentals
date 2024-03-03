package com.softserve.edu07.hw.Task1;

public abstract class Employee {
    protected String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}