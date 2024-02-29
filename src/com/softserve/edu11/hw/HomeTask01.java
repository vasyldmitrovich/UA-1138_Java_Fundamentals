package com.softserve.edu11.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        System.out.println("Enter the sentence of five words: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");

        System.out.println("\nThe longest word is: " + findLongestWord(words));
        System.out.println("The longest word length is: " + findLongestWord(words).length());
        System.out.println("Reversed second word is: " + reverseString(words[1]));
    }

    private static String findLongestWord(String[] strings) {
        String longestWord = "";
        for (var word : strings) {
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
