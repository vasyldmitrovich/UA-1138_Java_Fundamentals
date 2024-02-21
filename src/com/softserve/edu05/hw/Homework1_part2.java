package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework1_part2 {
    Scanner scanner = new Scanner(System.in);
    private int[] numbers = new int[10];
    private int sum = 0;
    private int product = 1;
    private int count = 0;

    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Homework1_part2 part2 = new Homework1_part2();
        part2.array();
        part2.sum();
        part2.countSum();
        part2.product();
        part2.countProduct();
    }

    void array() {
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    void sum() {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
                count++;
            }
        }
    }

    int getSum() {
        return sum;
    }

    void countSum() {
        if (count > 0) {
            System.out.println("Sum = " + getSum());
        } else {
            System.out.println("None of the five numbers were positive");
        }
    }

    void product() {
        count = 0;
        for (int i = 5; i < 10; i++) {
            if (numbers[i] < 0) {
                product = product * numbers[i];
                count++;
            }
        }
    }

    int getProduct() {
        return product;
    }

    void countProduct() {
        if (count > 0) {
            System.out.println("Product = " + getProduct());
        } else {
            System.out.println("None of the five numbers were negative");
        }
    }
}
