package com.softserve.edu05.hw;

import java.util.Scanner;

public class Homework1_part3 {
    Scanner scanner = new Scanner(System.in);
    private int[] numbers = new int[5];
    private int count = 0;

    public static void main(String[] args) {
        Homework1_part3 part3 = new Homework1_part3();
        System.out.println("Enter the numbers: ");
        part3.array();
        part3.position();
        part3.min();
        part3.product();
    }

    void array() {
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    void position() {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Second positive number:" + numbers[i]);
                break;
            }
        }
        if (count != 2) {
            System.out.println("There is no second positive number");
        }
    }

    void min() {
        int min = numbers[0];
        int imin = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");
    }

    void product() {
        int product = 1;
        count = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == 0) {
                product = product;
            } else if (numbers[i] % 2 == 0) {
                product = product * numbers[i];
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Product = " + product);
        } else {
            System.out.println("No paired numbers");
        }
    }
}
