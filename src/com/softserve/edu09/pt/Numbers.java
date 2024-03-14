package com.softserve.edu09.pt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {
        String input = "1, 2, 2, 3, 4, 5, 6, 7, 8, 8";

        String[] numbers = input.split(",\\s*");

        Set<String> uniqueNumbers = new HashSet<>();

        for (String number : numbers) {
            uniqueNumbers.add(number);
        }
        String uniqueToArray = Arrays.toString(uniqueNumbers.toArray(new String[0]));

        String result = String.join(", " + uniqueToArray);

        System.out.println("Original string: " + input);
        System.out.println("String with duplicate removal: " + result);

    }
}
