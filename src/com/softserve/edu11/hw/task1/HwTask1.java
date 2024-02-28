package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class HwTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words: ");
        var sentence = scanner.nextLine();
        System.out.println(sentence);

        String[] words = sentence.split(" ");
        String longest = "";
        for (var word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
        System.out.println("The length of longest word: " + longest.length());

        String secondWord = words[1];
        String reversedSecondWord = reverseString(secondWord);
        System.out.println("The second word in reverse order: " + reversedSecondWord);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
