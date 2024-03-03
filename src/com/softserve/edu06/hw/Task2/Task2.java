package com.softserve.edu06.hw.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Emily", 25, 3500);
        Developer developer1 = new Developer("Jack", 33, 7000, "Senior Java Developer");
        System.out.println(employee1.report());
        System.out.println(developer1.report());
    }
}