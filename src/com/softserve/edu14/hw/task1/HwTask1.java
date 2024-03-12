package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HwTask1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2021, 4, 20), 4500));
        products.add(new Product("Phone", LocalDate.of(2020, 5, 10), 3500));
        products.add(new Product("Laptop", LocalDate.of(2022, 3, 11), 7000));
        products.add(new Product("Phone", LocalDate.of(2019, 2, 3), 8000));

        List<Product> expensivePhones = products.stream()
                .filter(Product::isExpensivePhone)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
        expensivePhones.forEach(System.out::println);

        List<Employee> employees = List.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopular = Employee.mostPopularName(employees.stream());
        if (mostPopular.isPresent()) {
            System.out.println("Most popular name: " + mostPopular.get());
        } else {
            System.out.println("No employees found in the stream.");
        }
    }
}
