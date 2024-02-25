package com.softserve.edu09.pt.PT02;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static <List> void main(String[] args) {
        Scanner scanner = new Scanner(in);
        java.util.List<Integer> numbers = new ArrayList<>();
        String Line = scanner.nextLine();
        String[] tokens = Line.split(" ");
        for (var token : tokens) {
            int num = Integer.parseInt(token);

            if (!numbers.contains(num)) {
                numbers.add(num);

            }
        }
        System.out.println(numbers);
    }
}
