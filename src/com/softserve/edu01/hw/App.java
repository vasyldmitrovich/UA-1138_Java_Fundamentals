package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2...
        App.task2();

        // Task 3
        task3();
    }

    public static void task1 () {
        double pi = 3.14159;

        System.out.println("Input radius:");
        float radius = scanner.nextFloat();

        double  perimeter = 2 * pi * radius;
        double area =  pi * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
    public static void task2 () {
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live " + name + "?");
        String address = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your address is " + address);
    }
    public static void task3() {

        System.out.println("Input the cost of the first call: ");
        double c1 = scanner.nextDouble();
        System.out.println("Input the cost of the second call: ");
        double c2 = scanner.nextDouble();
        System.out.println("Input the cost of the third call: ");
        double c3 = scanner.nextDouble();

        System.out.println("Input the time of the first call: ");
        double t1 = scanner.nextDouble();
        System.out.println("Input the time of the second call: ");
        double t2 = scanner.nextDouble();
        System.out.println("Input the time of the third call: ");
        double t3 = scanner.nextDouble();

        System.out.println("Cost of each call ");
        double costOfCall1 = c1 * t1;
        System.out.println("call №1: " + costOfCall1);
        double costOfCall2 = c2 * t2;
        System.out.println("call №1: " + costOfCall2);
        double costOfCall3 = c3 * t3;
        System.out.println("call №1: " + costOfCall3);

        double totalCoast = costOfCall1 + costOfCall2 + costOfCall3;
        System.out.println("Total coast: " + totalCoast);
    }
}
