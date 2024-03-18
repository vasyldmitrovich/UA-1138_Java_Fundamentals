package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class PrTask01 {
    public static void main(String[] args) throws IOException {
        var file = Path.of("mytext.txt");
        String[] lines = Files.lines(file).toArray(String[]::new);
        System.out.println("There are " + lines.length + " lines");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(i + " : " + lines[i].length());
        }

        System.out.println(getTheShortestLine(lines));
        System.out.println(getTheLongestLine(lines));
        Arrays.stream(lines).filter(s -> s.contains("var")).forEach(System.out::println);
    }

    public static String getTheShortestLine(String[] strings) {
        return Arrays.stream(strings)
                .min(Comparator.comparing(String::length))
                .orElseThrow(() -> new IllegalArgumentException("0"));
    }

    public static String getTheLongestLine(String[] strings) {
        return Arrays.stream(strings)
                .max(Comparator.comparing(String::length))
                .orElseThrow(() -> new IllegalArgumentException("0"));
    }
}
