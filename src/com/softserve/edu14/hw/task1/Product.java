package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

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

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExpensivePhone() {
        return category.equalsIgnoreCase("Phone") && price > 3000
                && dateOfManufacture.isBefore(LocalDate.now().minusYears(1));
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}
