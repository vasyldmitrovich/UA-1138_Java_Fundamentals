package com.softserve.edu06.hw;

public class Hw2 {//All is good
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 50000);
        Developer developer = new Developer("Taras", 32, 32735.35, "Middle Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}



