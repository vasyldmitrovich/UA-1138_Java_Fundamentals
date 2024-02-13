package com.softserve.edu06.hw;

public class HomeTask02 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 29, 36_000),
                new Developer("Mike", 32, 48_000, "Java Developer")
        };
        for (var employee : employees) {
            System.out.println(employee.report());
        }
    }
}
