package com.softserve.edu8.pt.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> numbers = new ArrayList<>();
        String line = scanner.nextLine();
        String[] tokens = line.split(", ");

        for (String token : tokens) {
            int num = Integer.parseInt(token);
            if(!numbers.contains(num)){
                numbers.add(num);
            }
        }

        System.out.println(numbers);

    }
}
