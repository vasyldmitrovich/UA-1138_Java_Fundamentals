package com.softserve.edu11.hw.Task4;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    static Scanner scanner = new Scanner(in);
    static Random random = new Random();
    public static void main(String[] args) {
        String fullName = getFullName();
        greeting(fullName);
    }

    public static String getFullName() {
        boolean isValidFullName = false;

        String fullName = "";

        while (!isValidFullName) {
            System.out.print("Enter your full name: ");
            fullName = scanner.nextLine();

            if(!validateFullName(fullName)) {
                System.out.println("Incorrect data. Try again");
            } else {
                isValidFullName = true;
            }
        }
        return fullName;
    }

    public static boolean validateFullName(String fullName) {
        return fullName.matches("^[A-Za-z -]+$");
    }

    public static void greeting(String fullName) {
        List<String> greetingTemplate = List.of("Hi","Hello", "Welcome", "Nice to see you", "I`m happy you are here");
        String randomGreeting = greetingTemplate.get(random.nextInt(greetingTemplate.size()));

        System.out.printf("%s, %s", randomGreeting, fullName);
    }
}
