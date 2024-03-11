package com.softserve.edu09.hw.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> collection = createRandomCollection(10);
        System.out.println("Initial collection: " + collection);

        swapMinMax(collection);
        System.out.println("After swapping min and max elements: " + collection);

        int idx = findFirstNegativeIndex(collection);
        if (idx != -1) {
            insertAfterFirstNegative(collection, idx, 333);
        } else {
            System.out.println("No negative numbers found.");
        }
        System.out.println("After inserting 333 after the first negative number: " + collection);

        List<Integer> modifiedCollection = insertZeroBetweenDifferentSigns(collection);
        System.out.println("After inserting zeros between different signs: " + modifiedCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        splitAndMergeLists(collection, list1, list2, 4);
        System.out.println("After splitting and merging: ");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        removeElementAfterMin(collection);
        System.out.println("After removing the element following the minimum: " + collection);
    }

    private static List<Integer> createRandomCollection(int size) {
        List<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(50) - 10);
        }
        return collection;
    }

    private static void swapMinMax(List<Integer> list) {
        int maxIndex = list.indexOf(Collections.max(list));
        int minIndex = list.indexOf(Collections.min(list));
        Collections.swap(list, maxIndex, minIndex);
    }

    private static int findFirstNegativeIndex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }

    private static void insertAfterFirstNegative(List<Integer> list, int index, int value) {
        list.add(index, value);
    }

    private static List<Integer> insertZeroBetweenDifferentSigns(List<Integer> list) {
        List<Integer> modifiedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            modifiedList.add(list.get(i));
            if (i < list.size() - 1 && list.get(i) * list.get(i + 1) < 0) {
                modifiedList.add(0);
            }
        }
        return modifiedList;
    }

    private static void splitAndMergeLists(List<Integer> original, List<Integer> list1, List<Integer> list2, int k) {
        for (int i = 0; i < original.size(); i++) {
            if (i < k) {
                list1.add(original.get(i));
            } else {
                list2.add(0, original.get(i));
            }
        }
    }

    private static void removeElementAfterMin(List<Integer> list) {
        int minIndex = findMinIndex(list);
        if (minIndex < list.size() - 1) {
            list.remove(minIndex + 1);
        }
    }

    private static int findMinIndex(List<Integer> list) {
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}