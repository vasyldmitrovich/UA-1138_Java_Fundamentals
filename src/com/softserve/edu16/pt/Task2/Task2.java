package com.softserve.edu16.pt.Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String fileName = "src/com/softserve/edu16/pt/Task2/text2.txt";
        List<String> words = readWordsFromFile(fileName);

        if (words != null) {
            findWordsStartingWithVowel(words);
            findWordsWithMatchingFirstAndLastLetters(words);
        }
    }

    private static List<String> readWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return words;
    }

    private static void findWordsStartingWithVowel(List<String> words) {
        System.out.println("Words starting with a vowel:");
        for (String word : words) {
            if (word.matches("^[aeiouAEIOU].*")) {
                System.out.println(word);
            }
        }
    }

    private static void findWordsWithMatchingFirstAndLastLetters(List<String> words) {
        System.out.println("\nWords with matching first and last letters:");
        for (int i = 0; i < words.size() - 1; i++) {
            String currentWord = words.get(i);
            String nextWord = words.get(i + 1);
            if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                System.out.println(currentWord + " " + nextWord);
            }
        }

        String firstWord = words.get(0);
        String lastWord = words.get(words.size() - 1);
        if (firstWord.charAt(0) == lastWord.charAt(lastWord.length() - 1)) {
            System.out.println(lastWord + " " + firstWord);
        }
    }

}
