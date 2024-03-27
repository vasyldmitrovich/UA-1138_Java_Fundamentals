package com.softserve.edu14.hw.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice"),
                new Employee("Charlie"),
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Eve")
        );

        Optional<String> popularName = NameFinder.findPopularName(employees.stream());

        popularName.ifPresent(System.out::println);
    }
}
