package com.softserve.edu06;

public class HW6_02 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 31, 21000d);
        Developer developer = new Developer("Mathew", 33, "Senior Software engineer", 76000d);

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
