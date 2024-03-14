package com.softserve.edu14.hw;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeTask02 {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("John"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("Alice"),
                new Employee("Bob")
        );

        Optional<String> employeesWithMostPopularName = mostPopularName(employees);
        System.out.println(employeesWithMostPopularName);
    }

    public static Optional<String> mostPopularName(Stream<com.softserve.edu14.hw.Employee> employees) {
        Map<String, Long> nameCounts = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        Optional<Map.Entry<String, Long>> maxEntry = nameCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.map(Map.Entry::getKey);
    }
}
