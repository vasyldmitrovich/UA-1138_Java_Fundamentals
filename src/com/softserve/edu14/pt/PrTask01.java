package com.softserve.edu14.pt;

import java.util.List;
import java.util.stream.Collectors;

public class PrTask01 {
    public static void main(String[] args) {
        var list = List.of("bla", "", "ytvbhkjdbnj", "", "nbijnlns");
        var countEmpty = list.stream().filter(String::isEmpty).count();
        System.out.println("There are " + countEmpty + " empty strings");

        list.stream().filter(s -> !s.isEmpty()).forEach(System.out::println);
        var res = list.stream().filter(s -> !s.isEmpty()).map(s -> s.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(res);

    }
}
