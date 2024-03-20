package com.softserve.edu16.pt.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;

public class PrTask1 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("src/com/softserve/edu16/pt/task1/mytext.txt");
        String[] lines = Files.lines(file).toArray(String[]::new);
        for (int i = 0; i < lines.length; i++) {
            System.out.format("%2d : %3d : %s%n",
                    i, lines[i].length(), lines[i]);
        }
        System.out.println("=".repeat(50));
        Arrays.stream(lines).
                max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.println("=".repeat(50));
        Arrays.stream(lines)
                .filter(s -> s.trim().startsWith("var"))
                .forEach(System.out::println);
    }
}
