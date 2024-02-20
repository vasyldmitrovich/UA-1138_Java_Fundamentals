package com.softserve.edu06.hw.hw02;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;

    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d," + "Salary : \u20B4 $.2f.", getName(), getAge(), getSalary(), position);
    }
}