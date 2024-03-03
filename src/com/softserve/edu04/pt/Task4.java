package com.softserve.edu04.pt;


public class Task4 {
    public static void main(String[] args) {
        Product product1 = new Product("Carrot", 0.5, 10);
        Product product2 = new Product("Apple", 0.8, 15);
        Product product3 = new Product("Bread", 1.0, 2);
        Product product4 = new Product("Milk", 2.0, 3);

        Product mostExpensive = product1;

        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }
        System.out.println("The most expensive product is " + mostExpensive.getName() + " with quantity of " + mostExpensive.getQuantity());

        int maxQuantity = product1.getQuantity();
        if (product2.getQuantity() > maxQuantity) {
            maxQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > maxQuantity) {
            maxQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > maxQuantity) {
            maxQuantity = product4.getQuantity();
        }
        System.out.println("The products with maximum quantity of " + maxQuantity + " are: ");
        if (product1.getQuantity() == maxQuantity) {
            System.out.println("  " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println("  " + product2.getName());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println("  " + product3.getName());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println("  " + product4.getName());
        }
    }
}

