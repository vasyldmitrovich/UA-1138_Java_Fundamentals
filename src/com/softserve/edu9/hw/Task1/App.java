package com.softserve.edu9.hw.Task1;

import java.sql.SQLOutput;
import java.util.*;

public class App {
    static Random random = new Random();
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(101)-50;
            myCollection.add(randomNumber);
        }

        // Swap min and max element
        swapMaxAndMin(myCollection);

        // Insert a random three-digit number before the first negative element of the list
        insertNumbers(myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different signs
        insertZeroBetweenNumbers(myCollection);

        /*
            Copy the first k elements of the myCollection to the list1, in direct order,
            and the rest to the list2 in reverse order.
         */

        int k = 5;
        List<List<Integer>> doubleList = copyKelementsToLists(myCollection, k);
        List<Integer> list1 = doubleList.get(0);
        List<Integer> list2 = doubleList.get(1);

        System.out.println(list1);
        System.out.println(list2);


        /*
            In a list myCollection remove the last even element (if there are even elements in the list).
            If there is no such element, display a message.
         */
        removeLastEven(myCollection);

        // Remove the last minimum
        removeTheLastMinimum(myCollection);

    }

    public static List<Integer> swapMaxAndMin(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        int max = Collections.max(copyList);
        int min = Collections.min(copyList);

        int maxValueIndex = copyList.indexOf(max);
        int minValueIndex = copyList.indexOf(min);

        copyList.set(maxValueIndex, min);
        copyList.set(minValueIndex, max);

        System.out.println("Before swapping");
        System.out.println(list);

        System.out.println("After swapping");
        System.out.println(copyList);
        return copyList;
    }

    public static List<Integer> insertNumbers (List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        int theFirstNegativeIndex = 0;

        // Find first negative
        for (int el : list) {
            if(el < 0) {
                theFirstNegativeIndex = list.indexOf(el);
                break;
            }
        }

        // Add 3-digit number to the list
        for (int i = 0; i < 3; i++) {
            copyList.add(theFirstNegativeIndex, random.nextInt(100, 201));
        }

        System.out.println("3-digit number added before the first negative element of the list" );
        System.out.println(copyList);
        return copyList;
    }

    public static List<Integer> insertZeroBetweenNumbers(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        for (int i = 0; i < copyList.size()-1; i++) {
            if(     (copyList.get(i) < 0 && copyList.get(i+1) > 0) ||
                    (copyList.get(i) > 0 && copyList.get(i+1) < 0)
            ) {
                copyList.add(i+1, 0);
            }
        }

        System.out.println("Inserted zero between different sign");
        System.out.println(copyList);
        return copyList;
    }

    public static List<List<Integer>> copyKelementsToLists(List<Integer> originList, int k) {
        List<List<Integer>> doubleArrayList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //Copy to the list1, in direct order
        for (int i = 0; i < k; i++) {
            list1.add(originList.get(i));
        }

        //Copy to the list2, in reverse order
        for (int i = originList.size()-1; i >= k; i--) {
            list2.add(originList.get(i));
        }


        doubleArrayList.add(list1);
        doubleArrayList.add(list2);

        System.out.println("Copy to list1 directly and list2 in reversed");
        return doubleArrayList;
    }

    public static void removeLastEven(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);
        for (int i = copyList.size()-1; i >= 0 ; i--) {
            if (copyList.get(i) %2 == 0) {
                copyList.remove(i);
                System.out.println("Last even value removed");
                return;
            }
        }
        System.out.println("There are no even elements in the list");
    }

    public static void removeTheLastMinimum(List<Integer> list) {
        List<Integer> copyList = new ArrayList<>(list);

        int min = Collections.min(copyList);
        if(copyList.indexOf(min) != copyList.size()-1) {
            copyList.remove(copyList.indexOf(min)+1);
            System.out.println("The element following the first minimum deleted");
            return;
        }

        System.out.println("There are nothing to delete");
    }
}