package com.softserve.edu11.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence that contain five words: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = " ";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        int longestWordLength = longestWord.length();
        System.out.println(" Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
            System.out.println("Second word is reversed: " + reversedSecondWord);
        } else {
            System.out.println("The sentence is without the second word.");
        }
    }
}
