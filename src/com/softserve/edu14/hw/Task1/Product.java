package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String category, LocalDate dateOfManufacture, double price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public static List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Phone", LocalDate.of(2021, 3, 1), 5000));
        productList.add(new Product("Phone", LocalDate.of(2019, 7, 20), 2300));
        productList.add(new Product("Laptop", LocalDate.of(2023, 1, 17), 3700));
        productList.add(new Product("Laptop", LocalDate.of(2018, 10, 8), 3000));
        productList.add(new Product("Tablet", LocalDate.of(2020, 5, 12), 4200));
        productList.add(new Product("Phone", LocalDate.of(2017, 8, 15), 2800));
        productList.add(new Product("Tablet", LocalDate.of(2022, 4, 25), 3500));
        productList.add(new Product("Phone", LocalDate.of(2016, 12, 10), 3200));
        productList.add(new Product("Laptop", LocalDate.of(2019, 2, 18), 2900));
        productList.add(new Product("Tablet", LocalDate.of(2020, 9, 5), 3900));
        productList.add(new Product("Phone", LocalDate.of(2018, 6, 3), 2600));
        productList.add(new Product("Laptop", LocalDate.of(2021, 10, 17), 3400));
        productList.add(new Product("Tablet", LocalDate.of(2017, 11, 22), 2700));
        productList.add(new Product("Phone", LocalDate.of(2022, 8, 14), 3800));
        productList.add(new Product("Tablet", LocalDate.of(2016, 4, 9), 3100));
        productList.add(new Product("Phone", LocalDate.of(2019, 12, 27), 2600));
        productList.add(new Product("Tablet", LocalDate.of(2018, 2, 15), 3400));
        productList.add(new Product("Phone", LocalDate.of(2023, 5, 22), 3800));
        productList.add(new Product("Laptop", LocalDate.of(2017, 9, 10), 2900));
        productList.add(new Product("Tablet", LocalDate.of(2020, 11, 30), 3100));

        return productList;
    }

    public static List<Product> filterAndSortPhoneProducts(List<Product> productList) {
        return productList.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .collect(Collectors.toList());
    }
}



