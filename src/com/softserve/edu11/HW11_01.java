package com.softserve.edu11;

import java.util.Scanner;

public class HW11_01 {

    //I am learning Java Fundamentals
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the sentence of five words: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = findLongestWord(words);
        System.out.println("The longest word is " + longestWord);
        System.out.println("The number of letters in the longest word is " + longestWord.length());
        System.out.println("The second word in revers order: " + new StringBuilder(words[1]).reverse());
    }

    public static String findLongestWord(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            if (result.length() < words[i].length()) {
                result = words[i];
            }
        }
        return result;
    }
}
