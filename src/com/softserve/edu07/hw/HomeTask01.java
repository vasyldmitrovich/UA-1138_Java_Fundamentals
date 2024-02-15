package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class HomeTask01 {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("ABG087H", "John", 987345672, 25, 168),
                new ContractEmployee("NKG057H", "Bob", 287095622, 16, 84),
                new SalariedEmployee("ALMV87H", "Mark", 984721, 3000),
                new SalariedEmployee("CBG094H", "Kevin", 854673, 2200),
        };

        Arrays.sort(employees, Comparator.comparingInt(Employee::calculateAverageMonthlySalary).reversed());


        for (var employee : employees) {
            System.out.println(employee);
        }
    }
}
