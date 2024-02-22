package com.softserve.edu06.hw.hw02;

public class Hw02 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Bob", 22, 2345.34, "Hr"),
                new Developer("Jack", 28, 2345.34, "Middle Java Developer"),
                new Employee("Alice", 33, 8000.231)};

        for (var employee : employees){
            System.out.println(employee.report());
        }
    }
}
