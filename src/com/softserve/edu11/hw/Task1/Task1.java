package com.softserve.edu11.hw.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        String longestWord = findLongestWord(words);
        String reversedSecondWord = "";

        if (words.length > 1) {
            reversedSecondWord = reverseString(words[1]);
        }

        System.out.println("\nThe longest word is: " + longestWord);
        System.out.println("The longest word length is: " + longestWord.length());
        System.out.println("Reversed second word is: " + reversedSecondWord);

        scanner.close();
    }

    private static String findLongestWord(String[] strings) {
        String longestWord = "";
        for (String word : strings) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static String reverseString(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}