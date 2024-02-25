package com.softserve.edu09.pt.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PrTask3 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10, 40));
        }
        List<Integer> copyCollection = new ArrayList<>(myCollection);
        System.out.println(myCollection);

        List<Integer> newCollection = findIdxGreaterFive(myCollection);
        System.out.println("Indexes of elements >5: ");
        System.out.println(newCollection);

        myCollection.removeIf(element -> element > 20);
        System.out.println("After removing elements >20: ");
        System.out.println(myCollection);

        System.out.println("After inserting elements: ");
        System.out.println(copyCollection);
        copyCollection.add(2, 1);
        copyCollection.add(8, -3);
        copyCollection.add(5, -4);
        System.out.println(copyCollection);

        System.out.println("After sorting:");
        Collections.sort(copyCollection);
        System.out.println(copyCollection);
    }

    public static List<Integer> findIdxGreaterFive(List<Integer> myCollection) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                positions.add(i);
            }
        }
        return positions;
    }


}
