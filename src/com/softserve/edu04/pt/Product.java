package com.softserve.edu04.pt;

public class Product {
    String name;//Add to all fields access modifier private
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {//Move to some file like App.java not here

        Product product1 = new Product("Milk", 40, 6);
        Product product2 = new Product("Ice cream", 25, 10);
        Product product3 = new Product("Meat", 170, 4);
        Product product4 = new Product("Cookies", 100, 7);

        if (product1.getPrice() > product2.getPrice() &&
                product1.getPrice() > product3.getPrice() &&
                product1.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product1.name);
            System.out.println("Price: " + product1.price);
        } else if (product2.getPrice() > product1.getPrice() &&
                product2.getPrice() > product3.getPrice() &&
                product2.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product2.name);
            System.out.println("Price: " + product2.price);
        } else if (product3.getPrice() > product1.getPrice() &&
                product3.getPrice() > product2.getPrice() &&
                product3.getPrice() > product4.getPrice()) {
            System.out.println("The most expensive product: " + product3.name);
            System.out.println("Price: " + product3.price);
        } else {
            System.out.println("The most expensive product: " + product4.name);
            System.out.println("Price: " + product4.price);
        }


        if (product1.getQuantity() > product2.getQuantity() &&
                product1.getQuantity() > product3.getQuantity() &&
                product1.getQuantity() > product4.getQuantity()) {
            System.out.println("Product, which has the biggest quantity: " + product1.name);
        } else if (product2.getQuantity() > product1.getQuantity() &&
                product2.getQuantity() > product3.getQuantity() &&
                product2.getQuantity() > product4.getQuantity()) {
            System.out.println("Product, which has the biggest quantity: " + product2.name);
        } else if (product3.getQuantity() > product1.getQuantity() &&
                product3.getQuantity() > product2.getQuantity() &&
                product3.getQuantity() > product4.getQuantity()) {
            System.out.println("Product, which has the biggest quantity: " + product3.name);
        } else {
            System.out.println("Product, which has the biggest quantity: " + product4.name);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


