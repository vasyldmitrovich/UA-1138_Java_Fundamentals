package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Pt1 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("mytext.txt");
        String[] lines = Files.lines(file).toArray(String[]::new);
        System.out.println("There are lines " + lines.length + " lines");
        for (int i = 0; i < 3; i++) {
            System.out.println(lines[i]);
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.format("%2d : %3d : %s%n",
                    i, lines[i].length(), lines[i]);
        }
        System.out.format("*".repeat(40));

        Arrays.stream(lines)
                .min(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
        System.out.format("*".repeat(40));

        Arrays.stream(lines)
                .filter(s -> s.contains("var"))
                .forEach(System.out::println);

        Arrays.stream(lines)
                .filter(s -> s.trim().startsWith("var"))
                .forEach(System.out::println);
    }
}
