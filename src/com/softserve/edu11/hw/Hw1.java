package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five word sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word - " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());

        StringBuilder secondWordReversed = new StringBuilder(words[1]);
        secondWordReversed.reverse();
        System.out.println("Second word in reverse order: " + secondWordReversed);
    }
}
