package com.softserve.edu09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW9_01 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int element = (int) (Math.random() * 100);
            if (i % 3 == 0) {
                element = -1 * element;
            }
            myCollection.add(element);
        }
        System.out.println(myCollection);
        swapMaxAndMin(myCollection);
        System.out.println(myCollection);

        insertNumberBeforeFirstNegative(myCollection);
        System.out.println(myCollection);

        insertZeroBetweenElementsWithDiffSigns(myCollection);
        System.out.println(myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 7;
        copyElementsToTheLists(k, myCollection, list1, list2);
        System.out.println(list1);
        System.out.println(list2);

        removeLastEvenElement(myCollection);
        System.out.println(myCollection);

        removeElementAfterFirstMin(myCollection);
        System.out.println(myCollection);

    }

    private static void removeElementAfterFirstMin(List<Integer> collection) {
        int min = collection.get(0);
        int minIndex = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < min) {
                min = collection.get(i);
                minIndex = i;
            }
        }

        if (collection.size() - 1 > minIndex) {
            collection.remove(minIndex + 1);
        }
    }

    private static void removeLastEvenElement(List<Integer> collection) {
        boolean evenRemoved = false;
        for (int i = collection.size() - 1; i > -1; i--) {
            if (collection.get(i) != 0 && collection.get(i) % 2 == 0) {
                collection.remove(i);
                evenRemoved = true;
                break;
            }
        }

        if (!evenRemoved) {
            System.out.println("There is no even elements in the list");
        }
    }

    private static void copyElementsToTheLists(int k, List<Integer> origin, List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < k; i++) {
            list1.add(origin.get(i));
        }

        for (int i = origin.size() - 1; i >= k; i--) {
            list2.add(origin.get(i));
        }
    }

    public static void swapMaxAndMin(List<Integer> collection) {
        int max = collection.get(0);
        int indexMax = 0;
        int min = collection.get(0);
        int indexMin = 0;
        for (int i = 1; i < collection.size(); i++) {
            if (collection.get(i) > max) {
                max = collection.get(i);
                indexMax = i;
            }
            if (collection.get(i) < min) {
                min = collection.get(i);
                indexMin = i;
            }
        }
        Collections.swap(collection, indexMin, indexMax);
    }

    public static void insertNumberBeforeFirstNegative(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                collection.add(i, (int) (Math.random() * 1000));
                break;
            }
        }
    }

    public static void insertZeroBetweenElementsWithDiffSigns(List<Integer> collection) {
        for (int i = 0; i < collection.size() - 1; i++) {
            if (collection.get(i) == 0) {
                continue;
            }
            if ((collection.get(i) > 0 && collection.get(i + 1) < 0)
                    || (collection.get(i) < 0 && collection.get(i + 1) > 0)) {
                collection.add(i + 1, 0);
            }
        }
    }

}
