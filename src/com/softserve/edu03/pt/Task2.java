package com.softserve.edu03.pt;

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Thaddeus");
        employee1.setRate(18.5);
        employee1.setHours(6);
        Employee employee2 = new Employee("Justin", 11.5, 10);
        Employee employee3 = new Employee("Kate", 10, 12);

        System.out.println("Empl1: " + employee1);
        System.out.println("Empl2: " + employee2);
        System.out.println("Empl3: " + employee3);
        System.out.println(Employee.getTotalSum());

    }
}