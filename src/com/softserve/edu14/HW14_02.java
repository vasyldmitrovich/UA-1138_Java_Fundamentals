package com.softserve.edu14;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW14_02 {

    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Bob"),
                new Employee("Erik"),
                new Employee("Erik"),
                new Employee("Erik"),
                new Employee("Mike")
        );

        String mostPopularName = mostPopularName(employees).orElseGet(() -> "None");
        System.out.println(mostPopularName);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(e -> e.getName(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}

