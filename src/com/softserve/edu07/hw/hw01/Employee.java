package com.softserve.edu07.hw.hw01;

abstract class Employee {
    protected String employeeId;
    protected String name;

    protected Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public double averageSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
