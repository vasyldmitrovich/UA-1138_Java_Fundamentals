package com.softserve.edu14.pt.task1;

import java.util.List;
import java.util.stream.Collectors;

public class PrTask1 {
    public static void main(String[] args) {
        var list = List.of("bla", "", "", "aeweqt", "asaffsa");
        var countEmpty = list.stream()
                .filter(s -> s.isEmpty())
                .count();
        System.out.println("There are " + countEmpty + " empty strings int the list ");
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
        System.out.println("**************");
        var res = list.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(res);
    }
}
