package com.softserve.edu14.pt;

import java.util.List;
import java.util.stream.Collectors;

public class Pt1 {
    public static void main(String[] args) {
        var list = List.of("c++", "", "", "java", "", "python");
        // Task 1
        var countEmpty = list.stream().filter(String::isEmpty).count();
        System.out.println("There are " + countEmpty + " empty strings");
        System.out.println("*".repeat(40));

        // Task 2
        list.stream().filter(s -> !s.isEmpty()).forEach(System.out::println);
        System.out.println("*".repeat(40));

        // Task 3
        var res = list.stream().filter(s -> !s.isEmpty())
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(res);
    }
}
