package com.softserve.edu04.pt;

public class PT5 {
    public static void main(String[] args) {
        PT4.Product product1 = new PT4.Product("Table", 100, 2);
        PT4.Product product2 = new PT4.Product("Chair", 100, 4);
        PT4.Product product3 = new PT4.Product("Sofa", 300, 1);
        PT4.Product product4 = new PT4.Product("Bed", 200, 1);

        PT4.Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice() ){
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice() ){
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice() ){
            mostExpensive = product4;
        }
        System.out.println("The most expensive " + mostExpensive);

    int maxQuantity = product1.getQuantity();
    if (product2.getQuantity() > maxQuantity){
        maxQuantity = product2.getQuantity();
    }
    if (product3.getQuantity() > maxQuantity ){
        maxQuantity = product3.getQuantity();
    }
    if (product4.getQuantity() > maxQuantity ){
        maxQuantity = product4.getQuantity();
    }
    System.out.println("The products with max quantity is " + maxQuantity);
    if (product1.getQuantity() == maxQuantity){
        System.out.println("" + product1.getName());
        };
        if (product2.getQuantity() == maxQuantity){
            System.out.println("" + product2.getName());
        };
        if (product3.getQuantity() == maxQuantity){
            System.out.println("" + product3.getName());
        };
        if (product4.getQuantity() == maxQuantity){
            System.out.println("" + product4.getName());
        };
}}

