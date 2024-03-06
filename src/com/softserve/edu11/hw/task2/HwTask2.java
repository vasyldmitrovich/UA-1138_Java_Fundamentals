package com.softserve.edu11.hw.task2;

import java.util.Scanner;

public class HwTask2 {//Nice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        var sentence = scanner.nextLine();
        System.out.println("Entered sentence: ");
        System.out.println(sentence);
        String replacedSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("After replacing all consecutive spaces with a single space:");
        System.out.println(replacedSentence);
    }
}
