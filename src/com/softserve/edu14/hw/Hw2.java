package com.softserve.edu14.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Hw2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Jack"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Sam")

        );

        Optional<String> mostPopularName = mostPopularName(employees.stream());

        mostPopularName.ifPresent(System.out::println);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(entry -> entry.getValue()))
                .map(entry -> entry.getKey());
    }
}

