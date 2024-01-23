package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks
        // Task 1
        //App.task1();
        // Task 2
        App.task2();
    }

    public static void task1 () {
        System.out.println("Input radius of the circle: ");
        double radius = scanner.nextDouble();
        final double pi = Math.PI;
        double s = pi * Math.pow(radius, 2);
        double p = 2 * pi * radius;
        System.out.println("Square of the circle: " + s + "\nPerimeter of the circle: " + p);
    }

    public static void task2 () {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where dou you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println(name + " lives at " + address);
    }
}