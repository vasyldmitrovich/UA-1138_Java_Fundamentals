package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PrTask03 {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30));
        }

        System.out.println("Original collection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("Positions of elements greater than 5: " + newCollection);

        myCollection.removeIf(element -> element > 20);

        System.out.println("Collection after removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }
}

