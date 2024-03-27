package com.softserve.edu11.hw.Task4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name:");
        String firstName = validateName();

        System.out.println("Please enter your last name:");
        String lastName = validateName();

        String[] greetingPhrases = {
                "Hello, %s!",
                "Hey there, %s!",
                "Greetings, %s!",
                "%s, welcome!"
        };

        String randomGreeting = generateRandomGreeting(greetingPhrases, firstName + " " + lastName);
        System.out.printf(randomGreeting);
    }

    public static String validateName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("> ");
            name = scanner.nextLine();
            if (name.matches("^[a-zA-Z\\s-]+$")) {
                return name;
            } else {
                System.out.println("Invalid input. Please use only English letters.");
            }
        }
    }

    public static String generateRandomGreeting(String[] phrases, String userName) {
        Random random = new Random();
        String randomPhrase = phrases[random.nextInt(phrases.length)];
        return String.format(randomPhrase, userName);
    }
}