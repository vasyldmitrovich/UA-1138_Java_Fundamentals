package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class PracticalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Bob", "Alice", "Jack"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] numbers = {4, 2, 8, 3, 9};
        double sum = 0;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }

        average = sum / numbers.length;
        System.out.println("The average value is " + average);
        System.out.println("Enter the name to search: ");
        String nameToSearch = scanner.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("The name is on the list");
        } else {
            System.out.println("The name is not found");
        }
    }
}
