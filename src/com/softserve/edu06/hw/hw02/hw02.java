package com.softserve.edu06.hw.hw02;

public class hw02 {
    public static void main(String... args) {
        Employee employee = new Employee("Alex", 30, 20000);
        Developer developer = new Developer("Bob", 35, 40000, "Middle");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }

}

