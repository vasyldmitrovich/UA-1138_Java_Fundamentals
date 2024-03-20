package com.softserve.edu14.pt;

import java.util.List;

import static java.util.stream.Collectors.*;

public class Pt01 {
    public static void main(String[] args) {
        var list = List.of("bla", "", "adfsd", "", "Asdasd", "asdf");
        var countEmpty = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("There are " + countEmpty + " empty");

        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        System.out.println("*".repeat(30));

        var res = list.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toUpperCase)
                .collect(joining(", "));
        System.out.println(res);
    }
}
