package com.softserve.edu07.hw.Task1;

public abstract class Employee implements Payment{//All is good
    private static int nextId = 1;
    private String employeeId;
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
        this.employeeId = "EMP" + nextId++;
    }

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
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
