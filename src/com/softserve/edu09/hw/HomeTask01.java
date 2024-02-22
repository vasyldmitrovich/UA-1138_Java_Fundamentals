package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HomeTask01 {
    public static void main(String[] args) {
        List<Integer> myCollection = generateRandomList(10, -15, 15);

        System.out.println("Original Collection: " + myCollection);

        int maxElement = Collections.max(myCollection);
        int minElement = Collections.min(myCollection);

        List<Integer> myCollectionWithSwappedElements = swapMinMaxElements(myCollection, maxElement, minElement);
        System.out.println("Collection with swapped max and min elements: " + myCollectionWithSwappedElements);

        List<Integer> myCollectionWithAdded3DigitsNumber = add3DigitsNumber(myCollection);
        System.out.println("Collection with added 3-digits number: " + myCollectionWithAdded3DigitsNumber);

        List<Integer> myCollectionWithZeros = insertZerosBetweenDifferentSigns(myCollection);
        System.out.println("Collection with zeros between different signs: " + myCollectionWithZeros);

        List<Integer> myCollectionWithNewOrder = newOrderList(myCollection);
        System.out.println("Collection with a new order: " + myCollectionWithNewOrder);

        List<Integer> myCollectionWithoutLastEvenElement = removeLastEvenElement(myCollection);
        System.out.println("Collection without last even number: " + myCollectionWithoutLastEvenElement);

        List<Integer> myCollectionWithoutLastEvenElementFollowingTheFirstMinimum = listWithoutElementFollowingTheFirstMinimum(myCollection);
        System.out.println("Collection without number following first minimum: " + myCollectionWithoutLastEvenElementFollowingTheFirstMinimum);
    }

    private static List<Integer> generateRandomList(int size, int lowerBound, int upperBound) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(upperBound - lowerBound + 1) + lowerBound);
        }
        return list;
    }

    private static List<Integer> swapMinMaxElements(List<Integer> list, int maxElement, int minElement) {
        List<Integer> result = new ArrayList<>(list);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) == maxElement) {
                result.set(i, minElement);
            } else if (result.get(i) == minElement) {
                result.set(i, maxElement);
            }
        }
        return result;
    }

    private static List<Integer> add3DigitsNumber(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);
        Random random = new Random();
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < 0) {
                result.add(i, random.nextInt(900) + 100);
                break;
            }
        }
        return result;
    }

    private static List<Integer> insertZerosBetweenDifferentSigns(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i));

            if (i < list.size() - 1 && haveDifferentSigns(list.get(i), list.get(i + 1))) {
                result.add(0);
            }
        }
        return result;
    }

    private static boolean haveDifferentSigns(int a, int b) {
        return (a < 0 && b >= 0) || (a >= 0 && b < 0);
    }

    private static List<Integer> newOrderList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(list.get(i));
        }
        for (int i = list.size() - 1; i >= 5; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    private static List<Integer> removeLastEvenElement(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);

        for (int i = result.size() - 1; i >= 0; i--) {
            if (result.get(i) % 2 == 0) {
                result.remove(i);
                System.out.println("Last even element removed.");
                break;
            } else if (i == 0 && (result.get(i) % 2 == 1)) {
                System.out.println("No even elements to remove.");
            }
        }
        return result;
    }

    private static List<Integer> listWithoutElementFollowingTheFirstMinimum(List<Integer> list) {
        int min = Collections.min(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == min) {
                list.remove(i + 1);
                break;
            }
        }
        return list;
    }
}

