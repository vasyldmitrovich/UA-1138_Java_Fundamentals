package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Comparator;

public class PrTask1 {
    public static void main(String[] args) {
        Employee[] employees = {new ContractEmployee("2", 5.0, 300, "345353"),
                new SalariedEmployee("1", 4000, "455")};

        //sorting+calling calcPay method(try Array.sort)
        Arrays.sort(employees, Comparator.comparing(Employee::getEmployeeId));
        for (var employee : employees) {
            System.out.println(employee);
            if (employee instanceof Payment) {
                Payment paymentEmployee = (Payment) employee;
                paymentEmployee.calculatePay();
            }
        }
    }
}








