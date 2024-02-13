package com.softserve.edu06.hw.Task2;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Vitalii", 29, 100000, "Senior java developer"),
                new Developer("Valentin", 25, 110000, "Team lead java developer"),
                new Employee("Taras", 32, 32735.35),
                new Employee("Tymofii", 22, 49735.35)
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
