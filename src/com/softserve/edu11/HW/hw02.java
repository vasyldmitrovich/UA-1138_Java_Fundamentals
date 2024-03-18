package com.softserve.edu11.HW;

import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence ");
        String sentence = scanner.nextLine();
        String cleanedSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("New sentence: " + cleanedSentence);

    }
}

