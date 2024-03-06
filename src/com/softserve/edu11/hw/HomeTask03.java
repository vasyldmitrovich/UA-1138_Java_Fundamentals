package com.softserve.edu11.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Enter the text: ");
        String text = scan.nextLine();

        String filteredText = findUSCurrencyFormat(text);
        System.out.println("Matching with wanted format: " + filteredText);

    }

    private static String findUSCurrencyFormat(String string) {//Nice
        var regex = "\\$\\d+(\\.\\d{2})?";
        String[] words = string.split(" ");
        StringBuilder result = new StringBuilder();

        for (var word : words) {
            if (word.matches(regex)) {
                result.append(word).append(", ");
            }
        }
        return result.toString().trim();
    }
}
