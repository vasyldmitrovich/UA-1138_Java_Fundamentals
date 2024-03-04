package com.softserve.edu6.hw.task2;

public class Employee {
    String name;
    String position;
    int age;
    double salary;

    public Employee(String name, int age, double salary, String position) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Salary: \u20B4 %.2f," + " Position: %s", name, age, salary, position);
    }
}
