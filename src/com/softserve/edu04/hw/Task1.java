package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        boolean withinRange = (num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5);//Nice

        if (withinRange) {
            System.out.println("Усі числа належать до діапазону [-5, 5]");
        } else {
            System.out.println("Не всі числа належать до діапазону [-5, 5]");
        }
    }
}