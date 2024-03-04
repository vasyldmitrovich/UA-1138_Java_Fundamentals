package com.softserve.edu6.hw.task2;

public class Main {
    public static void main(String[] args) {
        Employee developer = new Developer("John", 20, 25678.53, "Average Java developer");
        Employee employee = new Employee("James", 27, 42344.76, "High Java developer");
        System.out.println(developer.report());
        System.out.println(employee.report());
    }
}
