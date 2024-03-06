package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class PrTask02 {//Good
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        List<Integer> numbers = new ArrayList<>();
        String line = scan.nextLine();
        String[] tokens = line.split(", ");
        for (var token : tokens) {
            int num = Integer.parseInt(token);
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }
}
