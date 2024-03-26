package com.softserve.edu14;

import java.time.LocalDate;

public class Product {
    String category;
    LocalDate manufactureDate;
    double price;

    public Product(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public Product() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}
