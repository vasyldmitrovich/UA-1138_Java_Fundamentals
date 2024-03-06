package com.softserve.edu09.hw;

import java.util.*;

import static java.lang.System.in;

public class Hw1 {
    public static void main(String[] args) {//Good
        Random random =  new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(-50,50);
            numbers.add(num);
        }
        System.out.println(numbers);
        System.out.println("*".repeat(60));

        swapMinMax(numbers);
        System.out.println(numbers);
        System.out.println("*".repeat(60));

        addRandomNegative(numbers);
        System.out.println(numbers);
        System.out.println("*".repeat(60));

        addZeroBetweenOpposite(numbers);
        System.out.println(numbers);
        System.out.println("*".repeat(60));

        Scanner scanner = new Scanner(in);
        System.out.print("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list1.add(numbers.get(i));
        }
        for (int i = number; i < numbers.size(); i++) {
            list2.add(numbers.get(i));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("*".repeat(60));

        removeFirstEven(numbers);
        System.out.println(numbers);
        System.out.println("*".repeat(60));

        removeNextAfterMin(numbers);
        System.out.println(numbers);
        System.out.println("*".repeat(60));
    }

    public static void swapMinMax(List<Integer> numbers) {
        int maxNumber = Collections.max(numbers);
        int indexOfMax = numbers.indexOf(maxNumber);
        int minNumber = Collections.min(numbers);
        int indexOfMin = numbers.indexOf(minNumber);
        Collections.swap(numbers, indexOfMax, indexOfMin);
    }

    public static void addRandomNegative(List<Integer> numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.add(i - 1, random.nextInt(100, 999));
                break;
            }
        }
    }

    public static void addZeroBetweenOpposite(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) * numbers.get(i + 1) < 0) {
                numbers.add(i + 1, 0);
                i++;
            }
        }
    }

    public static void removeFirstEven(List<Integer> numbers) {
        boolean removed = false;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("There are no even elements to remove");
        }
    }

    public static void removeNextAfterMin(List<Integer> numbers) {
        int indexOfMin = numbers.indexOf(Collections.min(numbers));
        if (indexOfMin != numbers.size() - 1) {
            numbers.remove(indexOfMin + 1);
        }
    }
}
