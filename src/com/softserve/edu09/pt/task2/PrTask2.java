package com.softserve.edu09.pt.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
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
