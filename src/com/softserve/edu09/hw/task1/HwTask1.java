package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HwTask1 {
    public static void main(String[] args) {//Too mach code in main method separate logic in some methods and call this method here
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10, 40));
        }
        System.out.println(myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println(myCollection);

        int idx = findIndexOfFirstNegative(myCollection);
        if (idx != -1) {
            myCollection.add(idx, 333);
        } else {
            System.out.println("No negative numbers found.");
        }
        System.out.println(myCollection);

        List<Integer> modifiedCollection = insertZeros(myCollection);
        System.out.println("After adding zeros: ");
        System.out.println(modifiedCollection);

        System.out.println("after coping to list1, list2: ");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int i = 0;
        int k = 4;
        for (var num : myCollection) {
            if (i < k) {
                list1.add(num);
            } else {
                list2.add(0, num);
            }
            i++;
        }
        System.out.println(list1);
        System.out.println(list2);


        System.out.println("After removing: ");
        System.out.println(myCollection);

        int minIndex1 = findMinIndex(myCollection);
        if (minIndex1 < myCollection.size() - 1) {
            myCollection.remove(minIndex1 + 1);
        } else {
        }
        System.out.println(myCollection);
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

    public static int findIndexOfFirstNegative(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> insertZeros(List<Integer> myCollection) {
        List<Integer> modifiedCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            modifiedCollection.add(myCollection.get(i));
            if (i < myCollection.size() - 1) {
                if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) ||
                        (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0)) {
                    modifiedCollection.add(0);
                }
            }
        }
        return modifiedCollection;
    }
}
