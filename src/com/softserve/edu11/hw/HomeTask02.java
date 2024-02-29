package com.softserve.edu11.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class HomeTask02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.println("Enter the sentence: ");
        String sentence = scan.nextLine();
        String sentenceWithReplacedTabs = sentence.replaceAll("\\s+", " ");

        System.out.println(sentenceWithReplacedTabs);
    }
}
