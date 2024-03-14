package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class HomeTask01 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone", LocalDate.of(2020, 1, 1), 4000),
                new Product("Laptop", LocalDate.of(2022, 6, 15), 3500),
                new Product("Phone", LocalDate.of(2021, 3, 10), 5000),
                new Product("Tablet", LocalDate.of(2023, 8, 20), 2800),
                new Product("Phone", LocalDate.of(2019, 12, 5), 3200)
        );

        List<Product> filteredProducts = filteredListOfProducts(products);
        System.out.println(filteredProducts);
    }

    public static List<Product> filteredListOfProducts(List<Product> list) {
        return list.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
    }
}
