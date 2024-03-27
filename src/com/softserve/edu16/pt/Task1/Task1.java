package com.softserve.edu16.pt.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        String fileName = "src/com/softserve/edu16/pt/Task1/mytext.txt";
        List<String> lines = readLinesFromFile(fileName);

        if (lines != null) {
            countSymbolsInLines(lines);
            findLongestAndShortest(lines);
            findLinesWithWord(lines, "var");
        }
    }

    private static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return lines;
    }

    private static void countSymbolsInLines(List<String> lines) {
        System.out.println("Number of symbols in each line:");
        for (String line : lines) {
            System.out.println(line.length());
        }
    }

    private static void findLongestAndShortest(List<String> lines) {
        String longestLine = lines.get(0);
        String shortestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            }
        }
        System.out.println("Longest line: " + longestLine);
        System.out.println("Shortest line: " + shortestLine);
    }

    private static void findLinesWithWord(List<String> lines, String word) {
        System.out.println("Lines containing the word \"" + word + "\":");
        for (String line : lines) {
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
