package com.softserve.edu04.pt;

public class PrTask04 {
    public static void main(String[] args) {//Too much code in main method, divide to separate methods
        Product[] products = {
                new Product("Table", 20, 20),
                new Product("Lamp", 10, 1),
                new Product("Chair", 50, 4),
                new Product("Cup", 55, 4),
        };

        System.out.println("The most expensive product is " + getMostExpensiveProductName(products) + ", quantity = " + getMostExpensiveProductQuantity(products));
        System.out.println("The products with max quantity of " + getMaxQuantityProduct(products) + " are the following: " + getMaxQuantityProductName(products));
    }

    public static String getMostExpensiveProductName(Product[] products) {
        Product mostExpensive = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products[i];
            }
        }
        return mostExpensive.getName();
    }

    public static int getMostExpensiveProductQuantity(Product[] products) {
        Product mostExpensive = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products[i];
            }
        }
        return mostExpensive.getQuantity();
    }

    public static int getMaxQuantityProduct(Product[] products) {
        Product maxQuantity = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getQuantity() > maxQuantity.getQuantity()) {
                maxQuantity = products[i];
            }
        }
        return maxQuantity.getQuantity();
    }

    public static String getMaxQuantityProductName(Product[] products) {
        Product maxQuantity = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getQuantity() > maxQuantity.getQuantity()) {
                maxQuantity = products[i];
            }
        }
        return maxQuantity.getName();
    }
}

