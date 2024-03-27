package com.softserve.edu14.hw.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = Product.createProductList();
        List<Product> filteredProducts = Product.filterAndSortPhoneProducts(productList);
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }
}


