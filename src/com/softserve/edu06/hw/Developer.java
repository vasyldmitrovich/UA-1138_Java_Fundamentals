package com.softserve.edu06.hw;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String report() {
        return String.format("%s, Position: %s", super.report(), position);
    }
}
