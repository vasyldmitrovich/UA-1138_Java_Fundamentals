package com.softserve.edu09.pt;

import java.util.*;

public class Pt3 {
    public static void main(String[] args) {
        Random random =  new Random();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> newNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(25);
            numbers.add(num);
            if (num > 5) {
                newNumbers.add(i);
            }
        }
        System.out.println("myCollection: " + numbers);
        System.out.println("*".repeat(40));
        System.out.println("newCollection: " + newNumbers);
        System.out.println("*".repeat(40));

        numbers.removeIf(item -> item > 20);

        System.out.println("myCollection (new variant): " + numbers);
        System.out.println("*".repeat(40));

        numbers.add(2, 1);
        numbers.add(8, -3);
        numbers.add(5, -4);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Position - " + i + ";" + " Value of element - " + numbers.get(i));
        }
        System.out.println("*".repeat(40));

        Collections.sort(numbers);
        System.out.println("Sorted collection: " + numbers);
    }
}
