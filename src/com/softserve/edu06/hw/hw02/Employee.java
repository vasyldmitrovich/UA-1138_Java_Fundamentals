package com.softserve.edu06.hw.hw02;

public class Employee {
    public String name;//Why public make private fields
    public int age;
    public double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," + "Salary : \u20B4 $.2f.", name, age, salary);
    }
}
