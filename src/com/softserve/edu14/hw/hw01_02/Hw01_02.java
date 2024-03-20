package com.softserve.edu14.hw.hw01_02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hw01_02 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("3D printing", LocalDate.of(2024, 01, 24), 2000));
        productList.add(new Product("Phone", LocalDate.of(2023, 04, 21), 4000));
        productList.add(new Product("Phone", LocalDate.of(2019, 12, 31), 3500));
        productList.add(new Product("Laptop", LocalDate.of(2022, 07, 17), 2500));
        productList.add(new Product("Phone", LocalDate.of(2018, 12, 28), 2500));

        productList.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().getYear() < LocalDate.now().getYear())
                .forEach(System.out::println);


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