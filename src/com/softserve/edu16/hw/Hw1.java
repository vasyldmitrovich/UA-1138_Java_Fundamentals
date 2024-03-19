package com.softserve.edu16.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class Hw1 {
    public static void main(String[] args) {
        var inputFile = Path.of("file1.txt");
        var outputFile = Path.of("file2.txt");

        try {
            String[] lines = Files.lines(inputFile).toArray(String[]::new);

            int numberOfLines = lines.length;

            String longestLine = getLongestLine(lines);

            LocalDate birthday = LocalDate.of(2005, 9, 13);
            String personalInfo = "My name is Yaroslav and my birthday is " + birthday.toString();

            try (BufferedWriter writer = Files.newBufferedWriter(outputFile)) {
                writer.write("Number of lines in file1.txt: " + numberOfLines);
                writer.newLine();
                writer.write("Longest line in file1.txt: " + longestLine);
                writer.newLine();
                writer.write(personalInfo);
            }

            System.out.println("Results have been written to file2.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getLongestLine(String[] lines) {
        return Stream.of(lines)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }
}


