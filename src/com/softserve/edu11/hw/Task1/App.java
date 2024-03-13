package com.softserve.edu11.hw.Task1;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a sentence with 5 words:");
        String sentence = scanner.nextLine();
        String theLongestWord = findTheLongestWorld(sentence);

        //• Identify the longest word in the sentence and display it on the console.
        System.out.println("The longest word is " + "\"" + theLongestWord + "\"");

        //• Determine the number of letters in the longest word.
        System.out.println("The number of letters is " + theLongestWord.length());

        //• Display the second word of the sentence in reverse order on the console.
        StringBuilder secondWord = new StringBuilder(sentence.split(" ")[1]);
        System.out.println(secondWord.reverse());
    }

    public static String findTheLongestWorld(String sentence) {
        var splittedString = sentence.split(" ");
        String theLongestWord = "";
        for (int i = 0; i < splittedString.length-1; i++) {
            if(splittedString[i].length() > splittedString[i+1].length()) {
                theLongestWord = splittedString[i];
            }
        }
        return theLongestWord;
    }

}
