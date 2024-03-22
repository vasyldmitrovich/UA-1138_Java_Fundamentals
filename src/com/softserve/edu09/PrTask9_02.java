package com.softserve.edu09;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class PrTask9_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        String line = scan.nextLine();
        String[] tokens = line.split(", ");
        Integer[] allNumbers = new Integer[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            allNumbers[i] = Integer.parseInt(tokens[i]);
        }
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        uniqueNumbers.addAll(Arrays.asList(allNumbers));

//        List<Integer> numbers = new ArrayList<>();
//        for (var token : tokens) {
//            int num = Integer.parseInt(token);
//            if (!numbers.contains(num)) {
//               numbers.add(num);
//            }
//        }

        System.out.println(Arrays.toString(allNumbers));
        System.out.println(uniqueNumbers);
    }
}
