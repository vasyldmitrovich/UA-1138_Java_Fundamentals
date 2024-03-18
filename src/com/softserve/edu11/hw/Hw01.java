package com.softserve.edu11.hw;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence of five words: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println("The longest word: " + word(words));
        System.out.println("Length: " + word(words).length());
        System.out.println("Reversed second word: " + reverseString(words[1]));
    }

    private static String word(String[] longWord){
        String longestWord = "";
        for(var word : longWord){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

    private static String reverseString(String secondWord){
        return new StringBuilder(secondWord).reverse().toString();
    }
}
