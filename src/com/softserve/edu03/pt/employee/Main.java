package com.softserve.edu03.pt.employee;

import java.util.Scanner;

import static com.softserve.edu03.pt.employee.Employee.printEmployeeStats;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        printEmployeeStats();
        Employee employee1 = new Employee();
        Employee.promptParameters(employee1);

        printEmployeeStats();
        Employee employee2 = new Employee();
        Employee.promptParameters(employee2);

        printEmployeeStats();
        Employee employee3 = new Employee();
        Employee.promptParameters(employee3);

        printEmployeeStats();
    }
}
