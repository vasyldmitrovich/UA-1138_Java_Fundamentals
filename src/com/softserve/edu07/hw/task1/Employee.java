package com.softserve.edu07.hw.task1;

abstract class Employee {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

}