package com.softserve.edu04.pt;

public class PrTask4 {
    public static void main(String[] args) {
        Product product1 = new Product("Table", 200, 2);
        Product product2 = new Product("Chair", 800, 3);
        Product product3 = new Product("Cup", 90, 8);
        Product product4 = new Product("Lamp", 50, 8);

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
        System.out.println("The most expensive product is: \n" + "name: " +
                mostExpensive.getName() + "\n" + "quantity: " + mostExpensive.getQuantity());

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
        System.out.println("The products with maximum quantity of " + maxQuantity + " are the following: ");
        if (product1.getQuantity() == maxQuantity) {
            System.out.println(" " + product1.getName());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println(" " + product2.getName());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println(" " + product3.getName());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println(" " + product4.getName());
        }
    }


}

class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}