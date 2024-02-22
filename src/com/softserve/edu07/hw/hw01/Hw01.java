package com.softserve.edu07.hw.hw01;

import java.util.Arrays;
import java.util.Comparator;

public class Hw01 {

    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("weqe", "Bob", 23, 400),
                new SalariedEmployee("FDAFG", "Alice", 29, 700),
                new ContractEmployee("ADGB", "Jack", 234, 14, 6),
                new ContractEmployee("KFKDM", "Maks", 95, 200, 12),
        };

        Arrays.sort(employees, Comparator.comparingDouble(Employee::averageSalary).reversed());

        for (var employee : employees){
            System.out.println(employee);
        }
    }

}
