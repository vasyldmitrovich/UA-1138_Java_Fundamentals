package com.softserve.edu06.hw.task2;

public class HwTask2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 21, 3000);
        Developer developer1 = new Developer("Alex", 30, 6000, "Middle java developer");
        System.out.println(employee1.report());
        System.out.println(developer1.report());
    }
}



