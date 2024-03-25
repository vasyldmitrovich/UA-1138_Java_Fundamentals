package com.softserve.edu14.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        Optional<String> mostPopular = mostPopularName(employees);
        System.out.println("Most popular name: " + mostPopular.orElse("None"));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        employees.forEach(e -> nameCountMap.put(e.getName(), nameCountMap.getOrDefault(e.getName(), 0) + 1));

        if (nameCountMap.isEmpty()) {
            return Optional.empty();
        }
        String mostPopularName = nameCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
        return Optional.of(mostPopularName);
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
