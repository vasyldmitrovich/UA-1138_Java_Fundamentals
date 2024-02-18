package com.softserve.edu07.hw;

abstract class Employee {
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld = '" + employeeld + '\'' +
                '}';
    }
}
