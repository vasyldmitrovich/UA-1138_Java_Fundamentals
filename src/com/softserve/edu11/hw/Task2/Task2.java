package com.softserve.edu11.hw.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String sentence = scanner.nextLine();
        System.out.println("Entered text: ");
        System.out.println(sentence);

        String replacedSentence = replaceConsecutiveSpaces(sentence);

        System.out.println("After replacing:");
        System.out.println(replacedSentence);

        scanner.close();
    }

    public static String replaceConsecutiveSpaces(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }
}
