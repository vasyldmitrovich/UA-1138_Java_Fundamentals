package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();

        // Task 2
        task2();
    }

    public static void task1 () {
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);
    }
    public static void task2 () {
        System.out.println("Input first string");
        String first = scanner.nextLine();
        System.out.println("Input second string");
        String second = scanner.nextLine();
        System.out.println("Input third string");
        String third = scanner.nextLine();

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}
