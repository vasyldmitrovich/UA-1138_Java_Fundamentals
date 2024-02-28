package com.softserve.edu11.hw.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HwTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the firstname:");
        String firstName = validateName(scanner);
        System.out.println("Enter the lastname:");
        String lastName = validateName(scanner);

        String[] greetings = {
                "Hello",
                "Good day",
                "Welcome",
                "Hi",
                "Hey there"
        };
        int randomIndex = random.nextInt(greetings.length);
        String randomGreeting = greetings[randomIndex];
        System.out.printf(randomGreeting + ", " + firstName + " " + lastName);

    }

    public static String validateName(Scanner scanner) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matcher;
        String name;
        do {
            name = scanner.nextLine().trim();
            matcher = pattern.matcher(name);
            if (!matcher.matches()) {
                System.out.println("Invalid input.Try again: ");
            }
        } while (!matcher.matches());

        return name;
    }
}
