package com.softserve.edu14.pt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "Simp", "", "second", "third", "third", "sec", "blablabla");

        long emptyStringCount = list.stream().filter(String::isEmpty).count();
        System.out.println("Number of empty string in the list: " + emptyStringCount);

        List<String> filteredList = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("List after removing empty strings: " + filteredList);

        String joinedString = filteredList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Joined and with uppercase strings: " + joinedString);
    }
}
