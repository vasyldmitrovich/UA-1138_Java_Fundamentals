package com.softserve.edu04.pt;


import java.util.Scanner;

public class Pt04 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Product product1 = new Product();
        Product.input(product1, "Input first product: ");
        Product product2 = new Product();
        Product.input(product2, "Input second product: ");
        Product product3 = new Product();
        Product.input(product3, "Input third product: ");
        Product product4 = new Product();
        Product.input(product4, "Input fourth product: ");

        mostExpensiveItem(product1, product2, product3, product4);
        biggestQuantity(product1, product2, product3, product4);
    }
    public static void mostExpensiveItem(Product product1, Product product2,
                                         Product product3, Product product4){
        Product mostExpensive = product1;
        if (mostExpensive.getPrice() < product2.getPrice()) {
            mostExpensive = product2;
        }
        if (mostExpensive.getPrice() < product3.getPrice()) {
            mostExpensive = product3;
        }
        if (mostExpensive.getPrice() < product4.getPrice()) {
            mostExpensive = product4;
        }

        System.out.println("The most expensive product is: a " + mostExpensive.getName() +
                " with a quantity of" + mostExpensive.getQuantity());
    }

    public static void biggestQuantity(Product product1, Product product2,
                                       Product product3, Product product4){
        Product biggestQuantity = product1;
        if (biggestQuantity.getQuantity() < product2.getQuantity()) {
            biggestQuantity = product2;
        }
        if (biggestQuantity.getQuantity() < product3.getQuantity()) {
            biggestQuantity = product3;
        }
        if (biggestQuantity.getQuantity() < product4.getQuantity()) {
            biggestQuantity = product4;
        }

        System.out.println("The most expensive product is: " + biggestQuantity.getName());
    }
}



class Product {
    private String name;
    private double price;
    private int quantity;

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


    public static void input(Product product, String text) {//Move out from this class
        System.out.println(text);
        String name = Pt04.SCANNER.nextLine();
        product.setName(name);
        System.out.println("Set price: " + '\'' + name + '\'');
        double price = Pt04.SCANNER.nextDouble();
        product.setPrice(price);
        System.out.println("Set quantity: " + '\'' + name + '\'');
        int quantity = Pt04.SCANNER.nextInt();
        product.setQuantity(quantity);
        Pt04.SCANNER.nextLine();
    }

}

