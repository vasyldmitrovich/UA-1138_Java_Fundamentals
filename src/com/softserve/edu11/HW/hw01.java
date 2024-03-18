package com.softserve.edu11.HW;

import java.util.Scanner;

public class hw01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence of five words: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + longestWord.length());

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
            System.out.println("Second word in reverse: " + reversedSecondWord);
        } else {
            System.out.println("The sentence does not have second word.");
        }

    }
}

