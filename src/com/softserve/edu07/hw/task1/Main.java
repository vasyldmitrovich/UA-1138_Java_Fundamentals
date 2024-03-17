package com.softserve.edu07.hw.task1;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Employee[] employees = {new ContractEmployee("739454329", "James", 25000),
                new ContractEmployee("213741347", "Jason", 30000),
                new SalariedEmployee("189237892", "Anna", 5000, 4),
                new SalariedEmployee("123094878", "Bob", 7000, 5),};

        int[] salarySort = new int[employees.length];
        for (int i = 0; i < employees.length; i++) {
            salarySort[i] = ((Payment) employees[i]).calculatePay();
        }

        Arrays.sort(salarySort);

        for (int i = 0; i < salarySort.length; i++) {
            int j = 0;
            for (Employee employee2 : employees) {
                if (salarySort[i] == ((Payment) employees[j]).calculatePay() && employee2 instanceof ContractEmployee) {
                    System.out.print("Employee ID: " + employees[j].employeeld);
                    System.out.print(". Employee name: " + ((ContractEmployee) employee2).federalTaxIdMember);
                    System.out.println(". Employee salary: " + ((Payment) employee2).calculatePay());
                }
                j++;
            }
            j = 0;
            for (Employee employee2 : employees) {
                if (salarySort[i] == ((Payment) employees[j]).calculatePay() && employee2 instanceof SalariedEmployee) {
                    System.out.print("Employee ID: " + employees[j].employeeld);
                    System.out.print(". Employee name: " + ((SalariedEmployee) employee2).socialSecurityNumber);
                    System.out.println(". Employee salary: " + ((Payment) employee2).calculatePay());
                }
                j++;
            }
        }
    }
}





