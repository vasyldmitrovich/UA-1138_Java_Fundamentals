package com.softserve.edu6.hw.task2;

public class Developer extends Employee {

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary, position);
    }

    @Override
    public String report() {
        return "Name: " + name +
                ", Age: " + age +
                ", Position: " + position +
                ", Salary: " + salary;
    }
}
