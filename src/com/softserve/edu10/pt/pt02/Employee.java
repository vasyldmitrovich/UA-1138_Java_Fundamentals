package com.softserve.edu10.pt.pt02;

import java.time.LocalDate;

public record Employee(int id, String name, Position position, double salary, LocalDate dob) {
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    public Employee withName(String name){
        return new Employee(id, name, position, salary, dob);
    }

    public Employee withPosition(Position position){
        return new Employee(id, name, position, salary, dob);
    }

    public Employee withSalary(double newSalary) {
         return new Employee(id, name, position, newSalary, dob);
    }
}
