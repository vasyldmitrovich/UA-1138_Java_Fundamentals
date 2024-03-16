package com.softserve.edu14.hw;

import com.softserve.edu06.hw.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product implements Comparable<Product> {
    private String manufacturer;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacturer, String category, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
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
                "manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

public class Hw1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Manufacturer1", "Phone",
                LocalDate.of(2020, 1, 1), 4000));
        products.add(new Product("Manufacturer2", "Phone",
                LocalDate.of(2021, 3, 5), 3500));
        products.add(new Product("Manufacturer3", "Phone",
                LocalDate.of(2023, 1, 17), 4500));
        products.add(new Product("Manufacturer4", "Phone",
                LocalDate.of(2018, 9, 13), 3100));

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted()
                .collect(Collectors.toList());

        filteredProducts.forEach(System.out::println);
    }
}
