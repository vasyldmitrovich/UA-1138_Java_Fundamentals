package com.softserve.edu14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HW14_01 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.of(2022, 10, 10), 1500.00f));
        products.add(new Product("Phone", LocalDate.of(2021, 10, 10), 2500.00f));
        products.add(new Product("Phone", LocalDate.of(2021, 10, 10), 3500.00f));
        products.add(new Product("Phone", LocalDate.of(2021, 10, 10), 3000.00f));
        products.add(new Product("Phone", LocalDate.of(2020, 10, 10), 4500.00f));
        products.add(new Product("Phone", LocalDate.of(2020, 10, 10), 1500.00f));
        products.add(new Product("Phone", LocalDate.of(2024, 1, 10), 3500.00f));
        products.add(new Product("Tablet", LocalDate.of(2022, 10, 10), 1500.00f));
        products.add(new Product("Tablet", LocalDate.of(2024, 3, 10), 3500.00f));
        products.add(new Product("Tablet", LocalDate.of(2019, 10, 10), 4500.00f));
        products.add(new Product("Tablet", LocalDate.of(2019, 10, 10), 2000.00f));
        products.add(new Product("Tablet", LocalDate.of(2021, 10, 10), 4500.00f));
        products.add(new Product("Tablet", LocalDate.of(2022, 10, 10), 1500.00f));
        products.add(new Product("Laptop", LocalDate.of(2021, 10, 10), 4500.00f));
        products.add(new Product("Laptop", LocalDate.of(2021, 10, 10), 1500.00f));
        products.add(new Product("Laptop", LocalDate.of(2024, 3, 10), 2500.00f));
        products.add(new Product("Laptop", LocalDate.of(2023, 10, 10), 3500.00f));
        products.add(new Product("Laptop", LocalDate.of(2023, 10, 10), 5500.00f));
        products.add(new Product("Laptop", LocalDate.of(2021, 10, 10), 2500.00f));
        products.add(new Product("Laptop", LocalDate.of(2020, 10, 10), 2500.00f));

        List<Product> filtered = products.stream()
                .filter(p -> "Phone".equals(p.getCategory())
                        && LocalDate.now().minusYears(1).isAfter(p.getManufactureDate())
                        && (p.getPrice() > 3000.00f))
                .toList();

        System.out.println(filtered);
    }
}
