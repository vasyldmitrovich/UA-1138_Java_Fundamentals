package com.softserve.edu9.hw.Task1;

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
        System.out.println(myCollection);

        // Insert a random three-digit number before the first negative element of the list
        insertNumbers(myCollection);
        System.out.println(myCollection);

        // Insert a zero between all neighboring elements collection myCollection with different signs
        insertZeroBetweenNumbers(myCollection);
        System.out.println(myCollection);

        /*
            Copy the first k elements of the myCollection to the list1, in direct order,
            and the rest to the list2 in reverse order.
         */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k = 5;
        copyKelementsToLists(myCollection, list1, list2, k);
        System.out.println(myCollection);
        System.out.println(list1);
        System.out.println(list2);

        /*
            In a list myCollection remove the last even element (if there are even elements in the list).
            If there is no such element, display a message.
         */

        System.out.println(myCollection);
        removeLastEven(myCollection);
        System.out.println(myCollection);

        // Remove the last minimum
        removeTheLastMinimum(myCollection);
        System.out.println(myCollection);
    }
    
    public static void swapMaxAndMin(List<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);
        list.set(list.indexOf(min), max);
        list.set(list.indexOf(max), min);
    }

    public static void insertNumbers (List<Integer> list) {
        int theFirstNegativeIndex = 0;

        // Find first negative
        for (int el : list) {
            if(el < 0) {
                theFirstNegativeIndex = list.indexOf(el);
                break;
            }
        }

        // Add 3 digits to the list
        for (int i = 0; i < 3; i++) {
            list.add(theFirstNegativeIndex, random.nextInt(101)-50);
        }
    }

    public static void insertZeroBetweenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if(     (list.get(i) < 0 && list.get(i+1) > 0) ||
                    (list.get(i) > 0 && list.get(i+1) < 0)
            ) {
                list.add(i+1, 0);
            }
        }
    }

    public static void copyKelementsToLists(List<Integer> originList,
                                            List<Integer> list1,
                                            List<Integer> list2,
                                            int k)
    {
        //Copy to the list1, in direct order
        for (int i = 0; i <= k; i++) {
            list1.add(originList.get(i));
        }

        //Copy to the list2, in reverse order
        for (int i = originList.size()-1; i > k; i--) {
            list2.add(originList.get(i));
        }
    }

    public static void removeLastEven(List<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i) %2 != 0) {
                list.remove(i);
                break;
            } else if(i == 0 && list.get(i) %2 != 0){
                System.out.println("There are no even elements in the list");
            }
        }
    }

    public static void removeTheLastMinimum(List<Integer> list) {
        int min = Collections.min(list);
        if((list.indexOf(min) != list.size()-1)) {
            list.remove(list.indexOf(min)+1);
        }
    }
}