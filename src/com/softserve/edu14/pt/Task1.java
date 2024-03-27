package com.softserve.edu14.pt;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class Task1 {
    public static void main(String[] args) {
        var data = List.of("tea", "", "carrot", "", "java", "keyboard");

        var countEmpty = data.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println(countEmpty + " strings is empty");

        data.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        System.out.println("*".repeat(30));

        var result = data.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(joining(", "));
        System.out.println(result);
    }
}