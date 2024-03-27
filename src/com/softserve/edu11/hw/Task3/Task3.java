package com.softserve.edu11.hw.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        scanner.close();

        String currencyFormats = findUSCurrencyFormat(text);
        if (!currencyFormats.isEmpty()) {
            System.out.println("Matching the desired format: " + currencyFormats);
        } else {
            System.out.println("No US currency formats found in the text.");
        }
    }

    private static String findUSCurrencyFormat(String text) {
        String regex = "\\$\\d+(\\.\\d{2})?";
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches(regex)) {
                result.append(word).append(", ");
            }
        }
        return result.toString().trim();
    }
}
